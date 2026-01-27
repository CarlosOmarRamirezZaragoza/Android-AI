package com.ml.dogedex.camera.main

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import androidx.camera.core.ImageProxy
import androidx.core.content.FileProvider
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ml.dogedex.camera.machinelearning.ClassifierTasks
import com.ml.dogedex.camera.machinelearning.DogRecognition
import com.ml.dogedex.core.api.ApiResponseStatus
import com.ml.dogedex.core.doglist.DogTasks
import com.ml.dogedex.core.model.Dog
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import java.io.File
import java.io.FileOutputStream
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dogRepository: DogTasks,
    private val classifierRepository: ClassifierTasks,
    @ApplicationContext private val context: Context,
) : ViewModel() {

    private val _dog = MutableLiveData<Dog>()
    val dog: LiveData<Dog>
        get() = _dog

    private val _status = MutableLiveData<ApiResponseStatus<Any>>()
    val status: LiveData<ApiResponseStatus<Any>>
        get() = _status

    private val _dogRecognition = MutableLiveData<DogRecognition>()
    val dogRecognition: LiveData<DogRecognition>
        get() = _dogRecognition

    private val _photoUri = MutableLiveData<Uri>()
    val photoUri: LiveData<Uri>
        get() = _photoUri

    private val _feature = MutableLiveData(Feature.DOG_RECOGNITION)
    val feature: LiveData<Feature>
        get() = _feature

    private val _mlKitInfo = MutableLiveData<String>()
    val mlKitInfo: LiveData<String>
        get() = _mlKitInfo

    val probableDogIds = mutableListOf<String>()

    fun recognizeImage(imageProxy: ImageProxy) {
        viewModelScope.launch {
            if (_feature.value == Feature.DOG_RECOGNITION) {
                val (dogRecognitionList, bitmap) = classifierRepository.recognizeImage(imageProxy)
                updateDogRecognition(dogRecognitionList)
                updateProbableDogIds(dogRecognitionList)
                bitmap?.let {
                    saveBitmapToFile(it)
                }
            }
            imageProxy.close()
        }
    }

    fun getMLDetailInformation(uri: Uri?) {
        viewModelScope.launch {
            _status.value = ApiResponseStatus.Loading()
            val bitmap = MediaStore.Images.Media.getBitmap(context.contentResolver, uri)
            when (_feature.value) {
                Feature.IMAGE_LABELING -> {
                    val imageLabelingInfo = classifierRepository.recognizeImageLabeling(bitmap)
                    _mlKitInfo.value = imageLabelingInfo
                }

                Feature.BARCODE_SCANNING -> {
                    val imageBarcode = classifierRepository.recognizeImageBarcode(bitmap)
                    _mlKitInfo.value = imageBarcode
                }

                else -> {
                    val imageText = classifierRepository.recognizeImageText(bitmap)
                    _mlKitInfo.value = imageText
                }
            }
            _status.value = ApiResponseStatus.Success("")
        }
    }

    fun setFeature(feature: Feature) {
        _feature.value = feature
    }

    private fun saveBitmapToFile(bitmap: Bitmap) {
        val file = File(context.cacheDir, "photo.jpg")
        val outputStream = FileOutputStream(file)
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
        outputStream.flush()
        outputStream.close()
        _photoUri.value =
            FileProvider.getUriForFile(context, "${context.packageName}.provider", file)
    }

    private fun updateProbableDogIds(dogRecognitionList: List<DogRecognition>) {
        probableDogIds.clear()
        if (dogRecognitionList.size >= 5) {
            probableDogIds
                .addAll(
                    dogRecognitionList.subList(1, 4)
                        .map {
                            it.id
                        })
        }
    }

    private fun updateDogRecognition(dogRecognitionList: List<DogRecognition>) {
        _dogRecognition.value = dogRecognitionList.first()
    }

    fun getDogByMlId(mlDogId: String) {
        viewModelScope.launch {
            _status.value = ApiResponseStatus.Loading()
            handleResponseStatus(dogRepository.getDogByMlId(mlDogId))
        }
    }

    private fun handleResponseStatus(apiResponseStatus: ApiResponseStatus<Dog>) {
        if (apiResponseStatus is ApiResponseStatus.Success) {
            _dog.value = apiResponseStatus.data!!
        }
    }

    override fun onCleared() {
        super.onCleared()
        classifierRepository.close()
    }
}