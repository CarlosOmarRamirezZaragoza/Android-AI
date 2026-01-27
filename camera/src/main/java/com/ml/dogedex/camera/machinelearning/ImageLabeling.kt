package com.ml.dogedex.camera.machinelearning

import android.graphics.Bitmap
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.label.ImageLabeling
import com.google.mlkit.vision.label.defaults.ImageLabelerOptions
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class ImageLabeling @Inject constructor() {
    suspend fun recognizeImage(bitmap: Bitmap): String {
        val options = ImageLabelerOptions.Builder()
            .setConfidenceThreshold(0.7f)
            .build()
        val labeler = ImageLabeling.getClient(options)
        val image = InputImage.fromBitmap(bitmap, 0)
        val labels = labeler.process(image).await()
        val stringBuilder = StringBuilder()
        for (label in labels) {
            val text = label.text
            val confidence = label.confidence
            stringBuilder.append("$text: $confidence\n")
        }
        if (labels.isEmpty()) {
            stringBuilder.append("No labels found")
        }
        return stringBuilder.toString()
    }
}