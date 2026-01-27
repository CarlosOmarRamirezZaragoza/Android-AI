package com.ml.dogedex.camera.machinelearning;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/ml/dogedex/camera/machinelearning/ClassifierTasks;", "Ljava/io/Closeable;", "recognizeImage", "Lkotlin/Pair;", "", "Lcom/ml/dogedex/camera/machinelearning/DogRecognition;", "Landroid/graphics/Bitmap;", "imageProxy", "Landroidx/camera/core/ImageProxy;", "(Landroidx/camera/core/ImageProxy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recognizeImageBarcode", "", "bitmap", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recognizeImageLabeling", "recognizeImageText", "camera_debug"})
public abstract interface ClassifierTasks extends java.io.Closeable {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recognizeImage(@org.jetbrains.annotations.NotNull()
    androidx.camera.core.ImageProxy imageProxy, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.util.List<com.ml.dogedex.camera.machinelearning.DogRecognition>, android.graphics.Bitmap>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recognizeImageLabeling(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recognizeImageBarcode(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recognizeImageText(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
}