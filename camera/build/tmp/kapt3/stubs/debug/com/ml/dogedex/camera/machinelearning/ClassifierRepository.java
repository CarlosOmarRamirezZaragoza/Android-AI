package com.ml.dogedex.camera.machinelearning;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J*\u0010\u0011\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/ml/dogedex/camera/machinelearning/ClassifierRepository;", "Lcom/ml/dogedex/camera/machinelearning/ClassifierTasks;", "classifier", "Lcom/ml/dogedex/camera/machinelearning/Classifier;", "imageLabeling", "Lcom/ml/dogedex/camera/machinelearning/ImageLabeling;", "imageBarcode", "Lcom/ml/dogedex/camera/machinelearning/BarCode;", "imageText", "Lcom/ml/dogedex/camera/machinelearning/TextRecognition;", "(Lcom/ml/dogedex/camera/machinelearning/Classifier;Lcom/ml/dogedex/camera/machinelearning/ImageLabeling;Lcom/ml/dogedex/camera/machinelearning/BarCode;Lcom/ml/dogedex/camera/machinelearning/TextRecognition;)V", "close", "", "convertImageProxyToBitmap", "Landroid/graphics/Bitmap;", "imageProxy", "Landroidx/camera/core/ImageProxy;", "recognizeImage", "Lkotlin/Pair;", "", "Lcom/ml/dogedex/camera/machinelearning/DogRecognition;", "(Landroidx/camera/core/ImageProxy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recognizeImageBarcode", "", "bitmap", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recognizeImageLabeling", "recognizeImageText", "camera_debug"})
public final class ClassifierRepository implements com.ml.dogedex.camera.machinelearning.ClassifierTasks {
    @org.jetbrains.annotations.NotNull()
    private final com.ml.dogedex.camera.machinelearning.Classifier classifier = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ml.dogedex.camera.machinelearning.ImageLabeling imageLabeling = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ml.dogedex.camera.machinelearning.BarCode imageBarcode = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ml.dogedex.camera.machinelearning.TextRecognition imageText = null;
    
    @javax.inject.Inject()
    public ClassifierRepository(@org.jetbrains.annotations.NotNull()
    com.ml.dogedex.camera.machinelearning.Classifier classifier, @org.jetbrains.annotations.NotNull()
    com.ml.dogedex.camera.machinelearning.ImageLabeling imageLabeling, @org.jetbrains.annotations.NotNull()
    com.ml.dogedex.camera.machinelearning.BarCode imageBarcode, @org.jetbrains.annotations.NotNull()
    com.ml.dogedex.camera.machinelearning.TextRecognition imageText) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object recognizeImage(@org.jetbrains.annotations.NotNull()
    androidx.camera.core.ImageProxy imageProxy, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.util.List<com.ml.dogedex.camera.machinelearning.DogRecognition>, android.graphics.Bitmap>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object recognizeImageLabeling(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object recognizeImageBarcode(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object recognizeImageText(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"UnsafeOptInUsageError"})
    private final android.graphics.Bitmap convertImageProxyToBitmap(androidx.camera.core.ImageProxy imageProxy) {
        return null;
    }
    
    @java.lang.Override()
    public void close() {
    }
}