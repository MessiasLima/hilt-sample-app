package com.example.hiltsampleapp.datasource.local

import kotlinx.coroutines.delay
import javax.inject.Inject

class MainLocalDataSourceImpl @Inject constructor(
    @RealmDAO private val mainDAO: MainDAO
) : MainLocalDataSource{
    override suspend fun getWelcomeText(): String {
        delay(1000) // delay to simulate a database query
        return WELCOME_TEXT
    }

    companion object{
        const val WELCOME_TEXT = "Be welcome to the World of modern Android Development"
    }
}