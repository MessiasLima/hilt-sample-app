package com.example.hiltsampleapp

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.hiltsampleapp.repository.main.MainRepository
import java.lang.RuntimeException
import javax.inject.Inject

class MainViewModel @ViewModelInject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {
    val welcomeText = liveData { emit(mainRepository.getWelcomeText()) }
}