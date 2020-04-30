package com.example.dogs.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dogs.model.DogBreed

class DetailViewModel : ViewModel(){
    val dogLiveData =  MutableLiveData<DogBreed>()

    fun fetch(){
        val dog = DogBreed("1","Corgi","15 years","breedGroup", "breedfor","temperament","")
        dogLiveData.value = dog
    }
}