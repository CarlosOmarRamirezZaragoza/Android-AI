package com.ml.dogedex.core.dogdetail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a8\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\u000b\u001a\u00020\u0001H\u0007\u001a*\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a8\u0006\u000f"}, d2 = {"MostProbableDogItem", "", "dog", "Lcom/ml/dogedex/core/model/Dog;", "onItemClicked", "Lkotlin/Function1;", "MostProbableDogsDialog", "mostProbableDogs", "", "onShowMostProbableDogsDialogDismiss", "Lkotlin/Function0;", "MostProbableDogsDialogPreview", "MostProbableDogsList", "dogs", "getFakeDogs", "core_debug"})
public final class MostProbableDogsDialogKt {
    
    @coil.annotation.ExperimentalCoilApi()
    @androidx.compose.runtime.Composable()
    public static final void MostProbableDogsDialog(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ml.dogedex.core.model.Dog> mostProbableDogs, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onShowMostProbableDogsDialogDismiss, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ml.dogedex.core.model.Dog, kotlin.Unit> onItemClicked) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @androidx.compose.runtime.Composable()
    public static final void MostProbableDogsList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ml.dogedex.core.model.Dog> dogs, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ml.dogedex.core.model.Dog, kotlin.Unit> onItemClicked) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @androidx.compose.runtime.Composable()
    public static final void MostProbableDogItem(@org.jetbrains.annotations.NotNull()
    com.ml.dogedex.core.model.Dog dog, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ml.dogedex.core.model.Dog, kotlin.Unit> onItemClicked) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    public static final void MostProbableDogsDialogPreview() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.ml.dogedex.core.model.Dog> getFakeDogs() {
        return null;
    }
}