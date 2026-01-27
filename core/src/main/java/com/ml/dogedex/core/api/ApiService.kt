package com.ml.dogedex.core.api

import com.ml.dogedex.core.*
import com.ml.dogedex.core.api.dto.AddDogToUserDTO
import com.ml.dogedex.core.api.dto.LoginDTO
import com.ml.dogedex.core.api.dto.SignUpDTO
import com.ml.dogedex.core.api.responses.AuthApiResponse
import com.ml.dogedex.core.api.responses.DefaultResponse
import com.ml.dogedex.core.api.responses.DogApiResponse
import com.ml.dogedex.core.api.responses.DogListApiResponse
import retrofit2.http.*

interface ApiService {
    @GET(GET_ALL_DOGS_URL)
    suspend fun getAllDogs(): DogListApiResponse

    @Headers("${ApiServiceInterceptor.NEEDS_AUTH_HEADER_KEY}: true")
    @POST(ADD_DOG_TO_USER_URL)
    suspend fun addDogToUser(@Body addDogToUserDTO: AddDogToUserDTO): DefaultResponse

    @Headers("${ApiServiceInterceptor.NEEDS_AUTH_HEADER_KEY}: true")
    @GET(GET_USER_DOGS_URL)
    suspend fun getUserDogs(): DogListApiResponse

    @GET(GET_DOG_BY_ML_ID)
    suspend fun getDogByMlId(@Query("ml_id") mlId: String): DogApiResponse
}
