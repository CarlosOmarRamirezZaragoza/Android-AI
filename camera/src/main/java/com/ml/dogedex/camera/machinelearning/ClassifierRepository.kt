package com.ml.dogedex.camera.machinelearning

import android.annotation.SuppressLint
import android.graphics.*
import androidx.camera.core.ImageProxy
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.ByteArrayOutputStream
import java.io.Closeable
import javax.inject.Inject

interface ClassifierTasks : Closeable {
    suspend fun recognizeImage(imageProxy: ImageProxy): Pair<List<DogRecognition>, Bitmap?>
    suspend fun recognizeImageLabeling(bitmap: Bitmap): String
    suspend fun recognizeImageBarcode(bitmap: Bitmap): String
    suspend fun recognizeImageText(bitmap: Bitmap): String
}

class ClassifierRepository @Inject constructor(
    private val classifier: Classifier,
    private val imageLabeling: ImageLabeling,
    private val imageBarcode: BarCode,
    private val imageText: TextRecognition,
) :
    ClassifierTasks {

    override suspend fun recognizeImage(imageProxy: ImageProxy): Pair<List<DogRecognition>, Bitmap?> =
        withContext(Dispatchers.IO) {
            val bitmap = convertImageProxyToBitmap(imageProxy)
            if (bitmap == null) {
                Pair(listOf(DogRecognition("", 0f)), null)
            } else {
                val recognitions = classifier.recognizeImage(bitmap).subList(0, 5)
                Pair(recognitions, bitmap)
            }
        }

    override suspend fun recognizeImageLabeling(bitmap: Bitmap): String = withContext(Dispatchers.IO) {
        imageLabeling.recognizeImage(bitmap)
    }

    override suspend fun recognizeImageBarcode(bitmap: Bitmap): String = withContext(Dispatchers.IO) {
        imageBarcode.recognizeImage(bitmap)
    }

    override suspend fun recognizeImageText(bitmap: Bitmap): String = withContext(Dispatchers.IO) {
        imageText.recognizeImageText(bitmap)
    }

    @SuppressLint("UnsafeOptInUsageError")
    private fun convertImageProxyToBitmap(imageProxy: ImageProxy): Bitmap? {
        val image = imageProxy.image ?: return null

        val yBuffer = image.planes[0].buffer // Y
        val uBuffer = image.planes[1].buffer // U
        val vBuffer = image.planes[2].buffer // V

        val ySize = yBuffer.remaining()
        val uSize = uBuffer.remaining()
        val vSize = vBuffer.remaining()

        val nv21 = ByteArray(ySize + uSize + vSize)

        //U and V are swapped
        yBuffer.get(nv21, 0, ySize)
        vBuffer.get(nv21, ySize, vSize)
        uBuffer.get(nv21, ySize + vSize, uSize)

        val yuvImage = YuvImage(nv21, ImageFormat.NV21, image.width, image.height, null)
        val out = ByteArrayOutputStream()
        yuvImage.compressToJpeg(
            Rect(0, 0, yuvImage.width, yuvImage.height), 100,
            out
        )
        val imageBytes = out.toByteArray()

        return BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)
    }

    override fun close() {
        classifier.close()
    }
}