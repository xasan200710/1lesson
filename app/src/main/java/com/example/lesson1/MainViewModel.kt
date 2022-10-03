package com.example.lesson1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

   private val _counterLV = MutableLiveData<Int>()
    val counterLV = _counterLV as LiveData<Int>
    private var counter = 0

    fun increment(){
        counter++
        _counterLV.value = counter
    }

}   