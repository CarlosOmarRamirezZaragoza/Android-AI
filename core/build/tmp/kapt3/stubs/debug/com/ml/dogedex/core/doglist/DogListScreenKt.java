package com.ml.dogedex.core.doglist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000*\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0007H\u0007\u001a4\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001a\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"GRID_SPAN_COUNT", "", "DogGridItem", "", "dog", "Lcom/ml/dogedex/core/model/Dog;", "onDogClicked", "Lkotlin/Function1;", "DogListScreen", "onNavigationIconClick", "Lkotlin/Function0;", "viewModel", "Lcom/ml/dogedex/core/doglist/DogListViewModel;", "DogListScreenTopBar", "onClick", "core_debug"})
public final class DogListScreenKt {
    private static final int GRID_SPAN_COUNT = 3;
    
    @coil.annotation.ExperimentalCoilApi()
    @androidx.compose.material.ExperimentalMaterialApi()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    @androidx.compose.runtime.Composable()
    public static final void DogListScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigationIconClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ml.dogedex.core.model.Dog, kotlin.Unit> onDogClicked, @org.jetbrains.annotations.NotNull()
    com.ml.dogedex.core.doglist.DogListViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DogListScreenTopBar(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @androidx.compose.material.ExperimentalMaterialApi()
    @androidx.compose.runtime.Composable()
    public static final void DogGridItem(@org.jetbrains.annotations.NotNull()
    com.ml.dogedex.core.model.Dog dog, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ml.dogedex.core.model.Dog, kotlin.Unit> onDogClicked) {
    }
}