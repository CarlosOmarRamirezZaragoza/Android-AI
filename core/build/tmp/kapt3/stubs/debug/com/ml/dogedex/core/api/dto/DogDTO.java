package com.ml.dogedex.core.api.dto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/ml/dogedex/core/api/dto/DogDTO;", "", "id", "", "index", "", "name", "", "type", "heightFemale", "heightMale", "imageUrl", "lifeExpectancy", "temperament", "weightFemale", "weightMale", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeightFemale", "()Ljava/lang/String;", "getHeightMale", "getId", "()J", "getImageUrl", "getIndex", "()I", "getLifeExpectancy", "getName", "getTemperament", "getType", "getWeightFemale", "getWeightMale", "core_debug"})
public final class DogDTO {
    private final long id = 0L;
    private final int index = 0;
    @com.squareup.moshi.Json(name = "name_en")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @com.squareup.moshi.Json(name = "dog_type")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @com.squareup.moshi.Json(name = "height_female")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String heightFemale = null;
    @com.squareup.moshi.Json(name = "height_male")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String heightMale = null;
    @com.squareup.moshi.Json(name = "image_url")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String imageUrl = null;
    @com.squareup.moshi.Json(name = "life_expectancy")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lifeExpectancy = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String temperament = null;
    @com.squareup.moshi.Json(name = "weight_female")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String weightFemale = null;
    @com.squareup.moshi.Json(name = "weight_male")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String weightMale = null;
    
    public DogDTO(long id, int index, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String heightFemale, @org.jetbrains.annotations.NotNull()
    java.lang.String heightMale, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String lifeExpectancy, @org.jetbrains.annotations.NotNull()
    java.lang.String temperament, @org.jetbrains.annotations.NotNull()
    java.lang.String weightFemale, @org.jetbrains.annotations.NotNull()
    java.lang.String weightMale) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final int getIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeightFemale() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeightMale() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLifeExpectancy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTemperament() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeightFemale() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeightMale() {
        return null;
    }
}