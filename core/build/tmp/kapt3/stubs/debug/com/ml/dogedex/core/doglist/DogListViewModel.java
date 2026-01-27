package com.ml.dogedex.core.doglist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001c\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fH\u0002J\u0006\u0010\u0014\u001a\u00020\u0011R6\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R:\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u00062\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/ml/dogedex/core/doglist/DogListViewModel;", "Landroidx/lifecycle/ViewModel;", "dogRepository", "Lcom/ml/dogedex/core/doglist/DogTasks;", "(Lcom/ml/dogedex/core/doglist/DogTasks;)V", "<set-?>", "Landroidx/compose/runtime/MutableState;", "", "Lcom/ml/dogedex/core/model/Dog;", "dogList", "getDogList", "()Landroidx/compose/runtime/MutableState;", "Lcom/ml/dogedex/core/api/ApiResponseStatus;", "", "status", "getStatus", "getDogCollection", "", "handleResponseStatus", "apiResponseStatus", "resetApiResponseStatus", "core_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class DogListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.ml.dogedex.core.doglist.DogTasks dogRepository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<java.util.List<com.ml.dogedex.core.model.Dog>> dogList;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.MutableState<com.ml.dogedex.core.api.ApiResponseStatus<java.lang.Object>> status;
    
    @javax.inject.Inject()
    public DogListViewModel(@org.jetbrains.annotations.NotNull()
    com.ml.dogedex.core.doglist.DogTasks dogRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<com.ml.dogedex.core.model.Dog>> getDogList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.ml.dogedex.core.api.ApiResponseStatus<java.lang.Object>> getStatus() {
        return null;
    }
    
    private final void getDogCollection() {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private final void handleResponseStatus(com.ml.dogedex.core.api.ApiResponseStatus<java.util.List<com.ml.dogedex.core.model.Dog>> apiResponseStatus) {
    }
    
    public final void resetApiResponseStatus() {
    }
}