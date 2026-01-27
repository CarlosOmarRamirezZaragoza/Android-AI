package com.ml.dogedex.core.dogdetail

import android.content.Context
import android.net.Uri
import android.provider.MediaStore
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.annotation.ExperimentalCoilApi
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import com.ml.dogedex.core.BuildConfig
import com.ml.dogedex.core.R
import com.ml.dogedex.core.api.ApiResponseStatus
import com.ml.dogedex.core.doglist.DogTasks
import com.ml.dogedex.core.model.Dog
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoilApi
@HiltViewModel
class DogDetailViewModel @Inject constructor(
    private val dogRepository: DogTasks,
    @ApplicationContext private val context: Context,
    savedStateHandle: SavedStateHandle,
) : ViewModel() {

    var dog = mutableStateOf(
        savedStateHandle.get<Dog>(DogDetailComposeActivity.DOG_KEY)
    )
        private set

    private var photoUri = mutableStateOf(
        savedStateHandle.get<Uri>(DogDetailComposeActivity.PHOTO_URI_KEY)
    )

    private var probableDogsIds = mutableStateOf(
        savedStateHandle.get<ArrayList<String>>(DogDetailComposeActivity.MOST_PROBABLE_DOGS_IDS)
            ?: arrayListOf()
    )

    var isRecognition = mutableStateOf(
        savedStateHandle.get<Boolean>(DogDetailComposeActivity.IS_RECOGNITION_KEY) ?: false
    )
        private set

    var status = mutableStateOf<ApiResponseStatus<Any>?>(null)
        private set

    private var _probableDogList = MutableStateFlow<MutableList<Dog>>(mutableListOf())
    val probableDogList: StateFlow<MutableList<Dog>>
        get() = _probableDogList

    private val generativeModel = GenerativeModel(
        modelName = "gemini-2.5-flash",
        apiKey = BuildConfig.GEMINI_API_KEY
    )

    init {
        getDogDescription()
    }

    private fun getDogDescription() {
        viewModelScope.launch {
            status.value = ApiResponseStatus.Loading()
            try {
                val bitmap =
                    MediaStore.Images.Media.getBitmap(context.contentResolver, photoUri.value)

                val inputContent = content {
                    image(bitmap)
                    text(
                        "Task:\n" +
                                "Analyze the dog shown in the image and determine whether it belongs to the breed ${dog.value?.name}.\n" +
                                "Context:\n" +
                                "Carefully observe the physical traits and overall appearance of the dog. If you believe the dog is not a " +
                                "${dog.value?.name}, explain briefly why and state which breed you think it is instead, based on visible " +
                                "characteristics. If you believe the dog is a ${dog.value?.name}, provide only the most relevant information " +
                                "about the breed.\n" +
                                "Output requirements and example:\n" +
                                "Write one single paragraph, with a maximum of 4 lines, including only the most important information.\n" +
                                "If the dog matches the breed, mention: average lifespan, average weight and height, differences between male " +
                                "and female, typical speed, and general temperament.\n" +
                                "If it does not match, briefly justify why and describe the breed you think it is using those same characteristics." +
                                "Example output:\n" +
                                "The dog in the image appears to be a Labrador Retriever due to its short coat, medium–large build, and friendly " +
                                "expression. Labradors typically live 10–12 years, weigh 25–36 kg, and measure 55–62 cm in height, with males slightly " +
                                "larger than females. They are energetic dogs capable of reaching moderate running speeds and are known for their friendly, " +
                                "intelligent, and outgoing temperament."
                    )
                }

                val response = generativeModel.generateContent(inputContent)

                response.text?.let {
                    dog.value = dog.value?.copy(description = it)
                }
                status.value = ApiResponseStatus.Success(Unit)
            } catch (e: Exception) {
                e.printStackTrace()
                status.value = ApiResponseStatus.Error(R.string.error_adding_dog)
            }
        }
    }

    fun getProbableDogs() {
        _probableDogList.value.clear()
        viewModelScope.launch {
            dogRepository.getProbableDogs(probableDogsIds.value)
                .collect { apiResponseStatus ->
                    if (apiResponseStatus is ApiResponseStatus.Success) {
                        val probableDogMutableList = _probableDogList.value.toMutableList()
                        probableDogMutableList.add(apiResponseStatus.data)
                        _probableDogList.value = probableDogMutableList
                    }
                }
        }
    }

    fun updateDog(newDog: Dog) {
        dog.value = newDog
        getDogDescription()
    }

    fun addDogToUser() {
        viewModelScope.launch {
            status.value = ApiResponseStatus.Loading()
            handleAddDogToUserResponseStatus(dogRepository.addDogToUser(dog.value!!.id))
        }
    }

    private fun handleAddDogToUserResponseStatus(apiResponseStatus: ApiResponseStatus<Any>) {
        status.value = apiResponseStatus
    }

    fun resetApiResponseStatus() {
        status.value = null
    }
}