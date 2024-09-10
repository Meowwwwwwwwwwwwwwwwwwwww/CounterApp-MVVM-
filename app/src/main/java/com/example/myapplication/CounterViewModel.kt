package com.example.myapplication

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class CounterViewModel: ViewModel(){
    var repo :CounterRepository=CounterRepository()
     private val _count = mutableStateOf(repo.counter().value)
     val count : MutableState< Int> = _count

     fun increment (){
      repo.increment()
         _count.value=repo.counter().value
     }
    fun decrement(){
        repo.decrement()
        _count.value=repo.counter().value
    }
}