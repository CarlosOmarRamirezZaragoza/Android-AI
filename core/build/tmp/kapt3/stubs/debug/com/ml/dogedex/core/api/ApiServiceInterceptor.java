package com.ml.dogedex.core.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ml/dogedex/core/api/ApiServiceInterceptor;", "Lokhttp3/Interceptor;", "()V", "NEEDS_AUTH_HEADER_KEY", "", "sessionToken", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "setSessionToken", "", "core_debug"})
public final class ApiServiceInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NEEDS_AUTH_HEADER_KEY = "needs_authentication";
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String sessionToken;
    @org.jetbrains.annotations.NotNull()
    public static final com.ml.dogedex.core.api.ApiServiceInterceptor INSTANCE = null;
    
    private ApiServiceInterceptor() {
        super();
    }
    
    public final void setSessionToken(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}