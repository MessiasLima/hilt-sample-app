package com.example.hiltsampleapp.repository.main

interface MainRepository {
    suspend fun getWelcomeText(): String
}