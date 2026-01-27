package com.ml.dogedex.core.api.responses;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/ml/dogedex/core/api/responses/DogApiResponse;", "", "message", "", "isSuccess", "", "data", "Lcom/ml/dogedex/core/api/responses/DogResponse;", "(Ljava/lang/String;ZLcom/ml/dogedex/core/api/responses/DogResponse;)V", "getData", "()Lcom/ml/dogedex/core/api/responses/DogResponse;", "()Z", "getMessage", "()Ljava/lang/String;", "core_debug"})
public final class DogApiResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @com.squareup.moshi.Json(name = "is_success")
    private final boolean isSuccess = false;
    @org.jetbrains.annotations.NotNull()
    private final com.ml.dogedex.core.api.responses.DogResponse data = null;
    
    public DogApiResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean isSuccess, @org.jetbrains.annotations.NotNull()
    com.ml.dogedex.core.api.responses.DogResponse data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ml.dogedex.core.api.responses.DogResponse getData() {
        return null;
    }
}