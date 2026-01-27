package com.ml.dogedex.camera.main;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0016H\u0014J\u001a\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\b\u0010\"\u001a\u00020\u0016H\u0002J\u001a\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\u0010\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u0016H\u0002J\b\u0010+\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006,"}, d2 = {"Lcom/ml/dogedex/camera/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/ml/dogedex/camera/databinding/ActivityMainBinding;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "isCameraReady", "", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "viewModel", "Lcom/ml/dogedex/camera/main/MainViewModel;", "getViewModel", "()Lcom/ml/dogedex/camera/main/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "enabledTakePhotoButton", "", "dogRecognition", "Lcom/ml/dogedex/camera/machinelearning/DogRecognition;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "openDogDetailActivity", "dog", "Lcom/ml/dogedex/core/model/Dog;", "photoUri", "Landroid/net/Uri;", "openDogListActivity", "openMLDetailActivity", "mlKitInfo", "requestCameraPermission", "setupCamera", "setupFeaturesMenu", "view", "Landroid/view/View;", "startCamera", "takePhoto", "camera_debug"})
@androidx.compose.foundation.ExperimentalFoundationApi()
@androidx.compose.material.ExperimentalMaterialApi()
@coil.annotation.ExperimentalCoilApi()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    private com.ml.dogedex.camera.databinding.ActivityMainBinding binding;
    private androidx.camera.core.ImageCapture imageCapture;
    private java.util.concurrent.ExecutorService cameraExecutor;
    private boolean isCameraReady = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.ml.dogedex.camera.main.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupFeaturesMenu(android.view.View view) {
    }
    
    private final void openMLDetailActivity(java.lang.String mlKitInfo, android.net.Uri photoUri) {
    }
    
    private final void openDogDetailActivity(com.ml.dogedex.core.model.Dog dog, android.net.Uri photoUri) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void setupCamera() {
    }
    
    private final void requestCameraPermission() {
    }
    
    private final void startCamera() {
    }
    
    private final void enabledTakePhotoButton(com.ml.dogedex.camera.machinelearning.DogRecognition dogRecognition) {
    }
    
    private final void takePhoto() {
    }
    
    private final void openDogListActivity() {
    }
}