package com.ml.dogedex.core.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/ml/dogedex/core/api/ApiService;", "", "addDogToUser", "Lcom/ml/dogedex/core/api/responses/DefaultResponse;", "addDogToUserDTO", "Lcom/ml/dogedex/core/api/dto/AddDogToUserDTO;", "(Lcom/ml/dogedex/core/api/dto/AddDogToUserDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllDogs", "Lcom/ml/dogedex/core/api/responses/DogListApiResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDogByMlId", "Lcom/ml/dogedex/core/api/responses/DogApiResponse;", "mlId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserDogs", "core_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "dogs")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllDogs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ml.dogedex.core.api.responses.DogListApiResponse> $completion);
    
    @retrofit2.http.Headers(value = {"needs_authentication: true"})
    @retrofit2.http.POST(value = "add_dog_to_user")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addDogToUser(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.ml.dogedex.core.api.dto.AddDogToUserDTO addDogToUserDTO, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ml.dogedex.core.api.responses.DefaultResponse> $completion);
    
    @retrofit2.http.Headers(value = {"needs_authentication: true"})
    @retrofit2.http.GET(value = "get_user_dogs")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserDogs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ml.dogedex.core.api.responses.DogListApiResponse> $completion);
    
    @retrofit2.http.GET(value = "find_dog_by_ml_id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDogByMlId(@retrofit2.http.Query(value = "ml_id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String mlId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ml.dogedex.core.api.responses.DogApiResponse> $completion);
}