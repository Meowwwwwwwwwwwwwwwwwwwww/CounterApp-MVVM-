package com.example.myapplication

import androidx.compose.runtime.mutableStateOf

data class CounterModel(var count:Int){

  }
class CounterRepository{
    private var _count= mutableStateOf(0)

    fun counter()=_count

    fun increment(){
        counter().value++
    }
    fun decrement(){
        counter().value--
    }
}