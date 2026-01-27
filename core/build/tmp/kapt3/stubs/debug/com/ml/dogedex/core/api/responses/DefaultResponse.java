package com.ml.dogedex.core.api.responses;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/ml/dogedex/core/api/responses/DefaultResponse;", "", "message", "", "isSuccess", "", "(Ljava/lang/String;Z)V", "()Z", "getMessage", "()Ljava/lang/String;", "core_debug"})
public final class DefaultResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @com.squareup.moshi.Json(name = "is_success")
    private final boolean isSuccess = false;
    
    public DefaultResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean isSuccess) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final boolean isSuccess() {
        return false;
    }
}