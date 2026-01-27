package com.ml.dogedex.core.doglist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00a2\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u000eJ2\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0012j\b\u0012\u0004\u0012\u00020\n`\u0013H\u00a6@\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/ml/dogedex/core/doglist/DogTasks;", "", "addDogToUser", "Lcom/ml/dogedex/core/api/ApiResponseStatus;", "dogId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDogByMlId", "Lcom/ml/dogedex/core/model/Dog;", "mlDogId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDogCollection", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProbableDogs", "Lkotlinx/coroutines/flow/Flow;", "probableDogsIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract interface DogTasks {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDogCollection(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ml.dogedex.core.api.ApiResponseStatus<java.util.List<com.ml.dogedex.core.model.Dog>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addDogToUser(long dogId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ml.dogedex.core.api.ApiResponseStatus<java.lang.Object>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDogByMlId(@org.jetbrains.annotations.NotNull()
    java.lang.String mlDogId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ml.dogedex.core.api.ApiResponseStatus<com.ml.dogedex.core.model.Dog>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProbableDogs(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> probableDogsIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.ml.dogedex.core.api.ApiResponseStatus<com.ml.dogedex.core.model.Dog>>> $completion);
}