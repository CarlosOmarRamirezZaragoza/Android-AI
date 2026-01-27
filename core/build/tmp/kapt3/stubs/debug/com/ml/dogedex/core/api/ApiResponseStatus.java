package com.ml.dogedex.core.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/ml/dogedex/core/api/ApiResponseStatus;", "T", "", "()V", "Error", "Loading", "Success", "Lcom/ml/dogedex/core/api/ApiResponseStatus$Error;", "Lcom/ml/dogedex/core/api/ApiResponseStatus$Loading;", "Lcom/ml/dogedex/core/api/ApiResponseStatus$Success;", "core_debug"})
public abstract class ApiResponseStatus<T extends java.lang.Object> {
    
    private ApiResponseStatus() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ml/dogedex/core/api/ApiResponseStatus$Error;", "T", "Lcom/ml/dogedex/core/api/ApiResponseStatus;", "messageId", "", "(I)V", "getMessageId", "()I", "core_debug"})
    public static final class Error<T extends java.lang.Object> extends com.ml.dogedex.core.api.ApiResponseStatus<T> {
        private final int messageId = 0;
        
        public Error(int messageId) {
        }
        
        public final int getMessageId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ml/dogedex/core/api/ApiResponseStatus$Loading;", "T", "Lcom/ml/dogedex/core/api/ApiResponseStatus;", "()V", "core_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.ml.dogedex.core.api.ApiResponseStatus<T> {
        
        public Loading() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/ml/dogedex/core/api/ApiResponseStatus$Success;", "T", "Lcom/ml/dogedex/core/api/ApiResponseStatus;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "core_debug"})
    public static final class Success<T extends java.lang.Object> extends com.ml.dogedex.core.api.ApiResponseStatus<T> {
        private final T data = null;
        
        public Success(T data) {
        }
        
        public final T getData() {
            return null;
        }
    }
}