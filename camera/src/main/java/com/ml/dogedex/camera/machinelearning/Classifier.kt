package com.ml.dogedex.camera.machinelearning

import android.graphics.Bitmap
import com.ml.dogedex.camera.MAX_RECOGNITION_DOG_RESULTS
import org.tensorflow.lite.Interpreter
import org.tensorflow.lite.nnapi.NnApiDelegate
import org.tensorflow.lite.support.common.TensorProcessor
import org.tensorflow.lite.support.common.ops.DequantizeOp
import org.tensorflow.lite.support.image.ImageProcessor
import org.tensorflow.lite.support.image.TensorImage
import org.tensorflow.lite.support.image.ops.ResizeWithCropOrPadOp
import org.tensorflow.lite.support.label.TensorLabel
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import java.io.Closeable
import java.nio.MappedByteBuffer
import java.util.*
import javax.inject.Inject

/**
 * A classifier class to recognize dogs from a given bitmap using a TensorFlow Lite model.
 * This class handles image pre-processing, model inference, and result post-processing.
 */
class Classifier @Inject constructor(
    tfLiteModel: MappedByteBuffer, // The TensorFlow Lite model file.
    private val labels: List<String> // A list of all possible dog breed labels.
) : Closeable {

    /**
     * The required width of the input image for the model.
     */
    private val imageSizeX: Int

    /**
     * The required height of the input image for the model.
     */
    private val imageSizeY: Int

    /**
     * Optional delegate for hardware acceleration.
     * NNAPI stands for Neural Networks API, a part of Android for running computationally intensive
     * operations for machine learning.
     */
    private val nnApiDelegate: NnApiDelegate?

    /**
     * The main instance of the TensorFlow (TF) Lite driver to run model inference.
     */
    private var tfLite: Interpreter

    /**
     * A buffer to hold the input image data after pre-processing.
     * It's a wrapper for a Tensor that is specialized for images.
     */
    private var inputImageBuffer: TensorImage

    /**
     * A buffer to hold the raw output probability of the model.
     * A TensorBuffer is a wrapper for a Tensor that can be dynamically resized.
     */
    private val outputProbabilityBuffer: TensorBuffer

    /**
     * A processor to apply post-processing operations on the model's output tensor.
     */
    private val tensorProcessor: TensorProcessor

    init {
        // Configure the TensorFlow Lite interpreter options.
        val tfLiteOptions = Interpreter.Options()
        nnApiDelegate = NnApiDelegate()
        // Add the NNAPI delegate to enable hardware acceleration.
        tfLiteOptions.addDelegate(nnApiDelegate)
        // Initialize the TFLite interpreter with the model and options.
        tfLite = Interpreter(tfLiteModel, tfLiteOptions)

        // Reads the input tensor's shape and type to determine image dimensions.
        val imageTensorIndex = 0
        val imageShape = tfLite.getInputTensor(imageTensorIndex).shape() // e.g., [1, 224, 224, 3]
        imageSizeY = imageShape[1]
        imageSizeX = imageShape[2]
        val imageDataType = tfLite.getInputTensor(imageTensorIndex).dataType()

        // Reads the output tensor's shape and type for the probability buffer.
        val probabilityTensorIndex = 0
        val probabilityShape =
            tfLite.getOutputTensor(probabilityTensorIndex).shape() // e.g., [1, 120] (120 dog breeds)
        val probabilityDataType = tfLite.getOutputTensor(probabilityTensorIndex).dataType()

        // Creates the input tensor buffer with the correct data type.
        inputImageBuffer = TensorImage(imageDataType)

        // Creates the output tensor buffer with a fixed size and data type.
        outputProbabilityBuffer = TensorBuffer.createFixedSize(
            probabilityShape,
            probabilityDataType
        )

        // Creates the post-processor for the output probability.
        // DequantizeOp is used to convert the model's integer output (0-255) back to a float probability (0.0-1.0).
        tensorProcessor = TensorProcessor.Builder().add(DequantizeOp(0f, 1 / 255.0f)).build()
    }

    /**
     * Loads a bitmap, and applies pre-processing steps to prepare it for the model.
     * @param bitmap The raw bitmap from the camera or gallery.
     * @return A TensorImage ready to be fed into the model.
     */
    private fun loadImage(bitmap: Bitmap): TensorImage {
        // Loads the bitmap into a TensorImage object.
        inputImageBuffer.load(bitmap)

        // Creates an ImageProcessor to apply a sequence of operations.
        val imageProcessor = ImageProcessor.Builder()
            // ResizeWithCropOrPadOp resizes the image to the model's expected input size (imageSizeY x imageSizeX).
            // It maintains the aspect ratio by either cropping or padding the image, which prevents distortion.
            .add(ResizeWithCropOrPadOp(imageSizeY, imageSizeX))
            .build()
        // Applies the defined pre-processing operations to the input image.
        return imageProcessor.process(inputImageBuffer)
    }

    /**
     * Runs the main inference process on a given bitmap and returns a list of recognized dogs.
     * @param bitmap The input image to be classified.
     * @return A list of [DogRecognition] objects, sorted by confidence.
     */
    fun recognizeImage(bitmap: Bitmap): List<DogRecognition> {
        // 1. Load and pre-process the image.
        inputImageBuffer = loadImage(bitmap)
        // 2. Rewind the output buffer to be ready to receive data.
        val rewoundOutputBuffer = outputProbabilityBuffer.buffer.rewind()
        // 3. Run the model inference.
        tfLite.run(inputImageBuffer.buffer, rewoundOutputBuffer)

        // 4. Post-process the output.
        // TensorLabel maps the float probabilities from the output buffer to the corresponding dog breed labels.
        val labeledProbability =
            TensorLabel(labels, tensorProcessor.process(outputProbabilityBuffer)).mapWithFloatValue

        // 5. Get the top-k results with the highest confidence.
        return getTopKProbability(labeledProbability)
    }

    /**
     * Releases the resources used by the TFLite interpreter and the NNAPI delegate.
     * It's crucial to call this method to avoid memory leaks.
     */
    override fun close() {
        tfLite.close()
        nnApiDelegate?.close()
    }

    /**
     * Sorts the classification results and returns the top K with the highest confidence.
     * @param labelProb A map where the key is the dog breed label and the value is the confidence score.
     * @return A list of the top [MAX_RECOGNITION_DOG_RESULTS] recognitions.
     */
    private fun getTopKProbability(labelProb: Map<String, Float>): List<DogRecognition> {
        // A PriorityQueue is used to efficiently find the top-K elements.
        // It's configured as a max-heap to keep the items with the highest confidence at the top.
        val priorityQueue =
            PriorityQueue(MAX_RECOGNITION_DOG_RESULTS) { lhs: DogRecognition, rhs: DogRecognition ->
                (rhs.confidence).compareTo(lhs.confidence)
            }

        // Add all recognitions to the priority queue.
        for ((key, value) in labelProb) {
            // The confidence is multiplied by 100 to represent it as a percentage.
            priorityQueue.add(DogRecognition(key, value * 100.0f))
        }

        // Poll the queue to get the top N results.
        val recognitions = mutableListOf<DogRecognition>()
        val recognitionsSize = minOf(priorityQueue.size, MAX_RECOGNITION_DOG_RESULTS)
        for (i in 0 until recognitionsSize) {
            recognitions.add(priorityQueue.poll()!!)
        }

        return recognitions
    }
}