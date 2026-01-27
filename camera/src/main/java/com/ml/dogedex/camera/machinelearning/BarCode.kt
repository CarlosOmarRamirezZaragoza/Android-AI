package com.ml.dogedex.camera.machinelearning

import android.graphics.Bitmap
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.common.InputImage
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class BarCode @Inject constructor() {
    suspend fun recognizeImage(bitmap: Bitmap): String {
        val scanner = BarcodeScanning.getClient()
        val image = InputImage.fromBitmap(bitmap, 0)
        val barcodes = scanner.process(image).await()
        val stringBuilder = StringBuilder()
        for (barcode in barcodes) {
            val rawValue = barcode.rawValue
            stringBuilder.append("Barcode: ").append(rawValue).append("\n")
        }
        if (barcodes.isEmpty()) {
            stringBuilder.append("No labels found")
        }
        return stringBuilder.toString()
    }
}