package com.ml.dogedex.core.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/ml/dogedex/core/model/User;", "", "id", "", "email", "", "authenticationToken", "(JLjava/lang/String;Ljava/lang/String;)V", "getAuthenticationToken", "()Ljava/lang/String;", "getEmail", "getId", "()J", "Companion", "core_debug"})
public final class User {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String authenticationToken = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String AUTH_PREFS = "auth_prefs";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ID_KEY = "id";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EMAIL_KEY = "email";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String AUTH_TOKEN_KEY = "auth_token";
    @org.jetbrains.annotations.NotNull()
    public static final com.ml.dogedex.core.model.User.Companion Companion = null;
    
    public User(long id, @org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/ml/dogedex/core/model/User$Companion;", "", "()V", "AUTH_PREFS", "", "AUTH_TOKEN_KEY", "EMAIL_KEY", "ID_KEY", "getLoggedInUser", "Lcom/ml/dogedex/core/model/User;", "activity", "Landroid/app/Activity;", "logout", "", "setLoggedInUser", "user", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setLoggedInUser(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        com.ml.dogedex.core.model.User user) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.ml.dogedex.core.model.User getLoggedInUser(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            return null;
        }
        
        public final void logout(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
    }
}