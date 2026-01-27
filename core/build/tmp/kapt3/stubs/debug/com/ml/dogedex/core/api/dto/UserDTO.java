package com.ml.dogedex.core.api.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/ml/dogedex/core/api/dto/UserDTO;", "", "id", "", "email", "", "authenticationToken", "(JLjava/lang/String;Ljava/lang/String;)V", "getAuthenticationToken", "()Ljava/lang/String;", "getEmail", "getId", "()J", "core_debug"})
public final class UserDTO {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @com.squareup.moshi.Json(name = "authentication_token")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String authenticationToken = null;
    
    public UserDTO(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String authenticationToken) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthenticationToken() {
        return null;
    }
}