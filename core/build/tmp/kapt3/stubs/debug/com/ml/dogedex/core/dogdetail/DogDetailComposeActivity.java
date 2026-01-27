package com.ml.dogedex.core.dogdetail;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\b"}, d2 = {"Lcom/ml/dogedex/core/dogdetail/DogDetailComposeActivity;", "Landroidx/activity/ComponentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "core_debug"})
@coil.annotation.ExperimentalCoilApi()
public final class DogDetailComposeActivity extends androidx.activity.ComponentActivity {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DOG_KEY = "dog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHOTO_URI_KEY = "photo_uri";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOST_PROBABLE_DOGS_IDS = "most_probable_dogs_ids";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_RECOGNITION_KEY = "is_recognition";
    @org.jetbrains.annotations.NotNull()
    public static final com.ml.dogedex.core.dogdetail.DogDetailComposeActivity.Companion Companion = null;
    
    public DogDetailComposeActivity() {
        super();
    }
    
    @java.lang.Override()
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class, androidx.compose.material.ExperimentalMaterialApi.class})
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/ml/dogedex/core/dogdetail/DogDetailComposeActivity$Companion;", "", "()V", "DOG_KEY", "", "IS_RECOGNITION_KEY", "MOST_PROBABLE_DOGS_IDS", "PHOTO_URI_KEY", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}