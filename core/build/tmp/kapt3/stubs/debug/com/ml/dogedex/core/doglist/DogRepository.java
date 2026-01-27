package com.ml.dogedex.core.doglist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\bH\u0082@\u00a2\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\bH\u0096@\u00a2\u0006\u0002\u0010\u0010J2\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u001a2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u001cj\b\u0012\u0004\u0012\u00020\u0016`\u001dH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\bH\u0082@\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/ml/dogedex/core/doglist/DogRepository;", "Lcom/ml/dogedex/core/doglist/DogTasks;", "apiService", "Lcom/ml/dogedex/core/api/ApiService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/ml/dogedex/core/api/ApiService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "addDogToUser", "Lcom/ml/dogedex/core/api/ApiResponseStatus;", "", "dogId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadDogs", "", "Lcom/ml/dogedex/core/model/Dog;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollectionList", "allDogList", "userDogList", "getDogByMlId", "mlDogId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDogCollection", "getProbableDogs", "Lkotlinx/coroutines/flow/Flow;", "probableDogsIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserDogs", "core_debug"})
public final class DogRepository implements com.ml.dogedex.core.doglist.DogTasks {
    @org.jetbrains.annotations.NotNull()
    private final com.ml.dogedex.core.api.ApiService apiService = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    
    @javax.inject.Inject()
    public DogRepository(@org.jetbrains.annotations.NotNull()
    com.ml.dogedex.core.api.ApiService apiService, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getDogCollection(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ml.dogedex.core.api.ApiResponseStatus<java.util.List<com.ml.dogedex.core.model.Dog>>> $completion) {
        return null;
    }
    
    private final java.util.List<com.ml.dogedex.core.model.Dog> getCollectionList(java.util.List<com.ml.dogedex.core.model.Dog> allDogList, java.util.List<com.ml.dogedex.core.model.Dog> userDogList) {
        return null;
    }
    
    private final java.lang.Object downloadDogs(kotlin.coroutines.Continuation<? super com.ml.dogedex.core.api.ApiResponseStatus<java.util.List<com.ml.dogedex.core.model.Dog>>> $completion) {
        return null;
    }
    
    private final java.lang.Object getUserDogs(kotlin.coroutines.Continuation<? super com.ml.dogedex.core.api.ApiResponseStatus<java.util.List<com.ml.dogedex.core.model.Dog>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addDogToUser(long dogId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ml.dogedex.core.api.ApiResponseStatus<java.lang.Object>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getDogByMlId(@org.jetbrains.annotations.NotNull()
    java.lang.String mlDogId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ml.dogedex.core.api.ApiResponseStatus<com.ml.dogedex.core.model.Dog>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getProbableDogs(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> probableDogsIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.ml.dogedex.core.api.ApiResponseStatus<com.ml.dogedex.core.model.Dog>>> $completion) {
        return null;
    }
}