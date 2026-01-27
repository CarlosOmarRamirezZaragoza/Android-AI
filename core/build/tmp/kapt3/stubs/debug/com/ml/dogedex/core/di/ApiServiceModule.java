package com.ml.dogedex.core.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00070\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/ml/dogedex/core/di/ApiServiceModule;", "", "()V", "provideApiService", "Lcom/ml/dogedex/core/api/ApiService;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "provideHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "okHttpClient", "core_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class ApiServiceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.ml.dogedex.core.di.ApiServiceModule INSTANCE = null;
    
    private ApiServiceModule() {
        super();
    }
    
    @dagger.Provides()
    public final com.ml.dogedex.core.api.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient provideHttpClient() {
        return null;
    }
}