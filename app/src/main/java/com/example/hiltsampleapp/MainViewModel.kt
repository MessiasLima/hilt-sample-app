package com.example.hiltsampleapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.hiltsampleapp.repository.main.MainRepository
import java.lang.RuntimeException
import javax.inject.Inject

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {
    class Factory @Inject constructor(
        private val mainRepository: MainRepository
    ) : ViewModelProvider.Factory{
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(MainViewModel::class.java)){
                return MainViewModel(mainRepository) as T
            } else {
                throw RuntimeException()
            }
        }
    }
}