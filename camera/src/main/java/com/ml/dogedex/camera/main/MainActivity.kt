package com.ml.dogedex.camera.main

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageCaptureException
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.core.content.ContextCompat
import coil.annotation.ExperimentalCoilApi
import com.ml.dogedex.camera.R
import com.ml.dogedex.camera.databinding.ActivityMainBinding
import com.ml.dogedex.camera.machinelearning.DogRecognition
import com.ml.dogedex.core.ml.MLDetailActivity
import com.ml.dogedex.core.api.ApiResponseStatus
import com.ml.dogedex.core.dogdetail.DogDetailComposeActivity
import com.ml.dogedex.core.doglist.DogListActivity
import com.ml.dogedex.core.model.Dog
import com.ml.dogedex.core.testutils.EspressoIdlingResource
import dagger.hilt.android.AndroidEntryPoint
import java.io.File
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

@ExperimentalFoundationApi
@ExperimentalMaterialApi
@ExperimentalCoilApi
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val requestPermissionLauncher =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                setupCamera()
            } else {
                Toast.makeText(
                    this, R.string.camera_permission_rejected_message,
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    private lateinit var binding: ActivityMainBinding
    private lateinit var imageCapture: ImageCapture
    private lateinit var cameraExecutor: ExecutorService
    private var isCameraReady = false
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dogListFab.setOnClickListener {
            openDogListActivity()
        }

        binding.featureSelectionButton.setOnClickListener {
            setupFeaturesMenu(it)
        }

        viewModel.status.observe(this) { status ->

            when (status) {
                is ApiResponseStatus.Error -> {
                    binding.loadingWheel.visibility = View.GONE
                    Toast.makeText(this, status.messageId, Toast.LENGTH_SHORT).show()
                }

                is ApiResponseStatus.Loading -> binding.loadingWheel.visibility = View.VISIBLE
                is ApiResponseStatus.Success -> binding.loadingWheel.visibility = View.GONE
            }
        }

        viewModel.dog.observe(this) { dog ->
            if (dog != null) {
                openDogDetailActivity(dog, viewModel.photoUri.value)
            }
        }

        viewModel.dogRecognition.observe(this) {
            enabledTakePhotoButton(it)
        }

        viewModel.feature.observe(this) {
            // Invalidate the take photo button
            enabledTakePhotoButton(viewModel.dogRecognition.value)
        }

        viewModel.mlKitInfo.observe(this) { mlKitInfo ->
            if (mlKitInfo != null) {
                openMLDetailActivity(mlKitInfo, viewModel.photoUri.value)
            }
        }

        requestCameraPermission()
    }

    private fun setupFeaturesMenu(view: View) {
        val popupMenu = PopupMenu(this, view)
        popupMenu.menuInflater.inflate(R.menu.features_menu, popupMenu.menu)

        popupMenu.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_dog_recognition -> viewModel.setFeature(Feature.DOG_RECOGNITION)
                R.id.action_image_labeling -> viewModel.setFeature(Feature.IMAGE_LABELING)
                R.id.action_barcode_scanning -> viewModel.setFeature(Feature.BARCODE_SCANNING)
                R.id.action_text_recognition -> viewModel.setFeature(Feature.TEXT_RECOGNITION)
            }
            true
        }
        popupMenu.show()
    }

    private fun openMLDetailActivity(mlKitInfo: String, photoUri: Uri?) {
        binding.loadingWheel.visibility = View.GONE
        val intent = Intent(this, MLDetailActivity::class.java)
        intent.putExtra(MLDetailActivity.PHOTO_URI_KEY, photoUri)
        intent.putExtra(MLDetailActivity.ML_KIT_INFO_KEY, mlKitInfo)
        startActivity(intent)
    }

    private fun openDogDetailActivity(dog: Dog, photoUri: Uri?) {
        binding.loadingWheel.visibility = View.GONE
        val intent = Intent(this, DogDetailComposeActivity::class.java)
        intent.putExtra(DogDetailComposeActivity.DOG_KEY, dog)
        intent.putExtra(DogDetailComposeActivity.PHOTO_URI_KEY, photoUri)
        intent.putExtra(
            DogDetailComposeActivity.MOST_PROBABLE_DOGS_IDS,
            ArrayList<String>(viewModel.probableDogIds)
        )
        intent.putExtra(DogDetailComposeActivity.IS_RECOGNITION_KEY, true)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        if (::cameraExecutor.isInitialized) {
            cameraExecutor.shutdown()
        }
    }

    private fun setupCamera() {
        binding.cameraPreview.post {
            imageCapture = ImageCapture.Builder()
                .setTargetRotation(binding.cameraPreview.display.rotation)
                .build()
            cameraExecutor = Executors.newSingleThreadExecutor()
            startCamera()
            isCameraReady = true
        }
    }

    private fun requestCameraPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            when {
                ContextCompat.checkSelfPermission(
                    this, Manifest.permission.CAMERA
                ) == PackageManager.PERMISSION_GRANTED -> {
                    setupCamera()
                }

                shouldShowRequestPermissionRationale(Manifest.permission.CAMERA) -> {
                    AlertDialog.Builder(this)
                        .setTitle(R.string.camera_permission_rationale_dialog_title)
                        .setMessage(R.string.camera_permission_rationale_dialog_message)
                        .setPositiveButton(android.R.string.ok) { _, _ ->
                            requestPermissionLauncher.launch(
                                Manifest.permission.CAMERA
                            )
                        }
                        .setNegativeButton(android.R.string.cancel) { _, _ ->
                        }.show()
                }

                else -> {
                    requestPermissionLauncher.launch(
                        Manifest.permission.CAMERA
                    )
                }
            }
        } else {
            setupCamera()
        }
    }

    private fun startCamera() {
        val cameraProviderFuture =
            ProcessCameraProvider.getInstance(this)

        EspressoIdlingResource.increment()
        cameraProviderFuture.addListener({
            // Used to bind the lifecycle of cameras to the lifecycle owner
            val cameraProvider = cameraProviderFuture.get()
            // Preview
            val preview = Preview.Builder().build()
            preview.setSurfaceProvider(binding.cameraPreview.surfaceProvider)

            // Select back camera as a default
            val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA

            val imageAnalysis = ImageAnalysis.Builder()
                .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
                .build()
            imageAnalysis.setAnalyzer(cameraExecutor) { imageProxy ->
                EspressoIdlingResource.decrement()
                viewModel.recognizeImage(imageProxy)
            }

            // Bind use cases to camera
            cameraProvider.bindToLifecycle(
                this, cameraSelector,
                preview, imageCapture, imageAnalysis
            )
        }, ContextCompat.getMainExecutor(this))
    }

    private fun enabledTakePhotoButton(dogRecognition: DogRecognition?) {
        if (viewModel.feature.value == Feature.DOG_RECOGNITION) {
            if (dogRecognition != null && dogRecognition.confidence >= 70.0) {
                binding.takePhotoFab.alpha = 1f
                binding.takePhotoFab.setOnClickListener {
                    viewModel.getDogByMlId(dogRecognition.id)
                }
            } else {
                binding.takePhotoFab.alpha = 0.2f
                binding.takePhotoFab.setOnClickListener(null)
            }
        } else {
            binding.takePhotoFab.alpha = 1f
            binding.takePhotoFab.setOnClickListener {
                takePhoto()
            }
        }
    }

    private fun takePhoto() {
        val outputFile = File(cacheDir, "photo.jpg")
        val outputOptions = ImageCapture.OutputFileOptions.Builder(outputFile).build()
        imageCapture.takePicture(outputOptions, cameraExecutor,
            object : ImageCapture.OnImageSavedCallback {
                override fun onError(exc: ImageCaptureException) {
                    Toast.makeText(
                        this@MainActivity,
                        getString(R.string.error_taking_photo),
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onImageSaved(output: ImageCapture.OutputFileResults) {
                    viewModel.getMLDetailInformation(output.savedUri)
                }
            })
    }

    private fun openDogListActivity() {
        startActivity(Intent(this, DogListActivity::class.java))
    }

}