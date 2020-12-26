package com.example.hiltsampleapp.datasource.local

interface MainLocalDataSource {
    suspend fun getWelcomeText(): String
}