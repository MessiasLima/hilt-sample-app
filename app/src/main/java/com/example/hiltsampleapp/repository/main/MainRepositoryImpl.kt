package com.example.hiltsampleapp.repository.main

import com.example.hiltsampleapp.datasource.api.MainRemoteDataSource
import com.example.hiltsampleapp.datasource.local.MainLocalDataSource
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val mainRemoteDataSource: MainRemoteDataSource,
    private val mainLocalDataSource: MainLocalDataSource
) : MainRepository {
    override suspend fun getWelcomeText(): String {
        return mainLocalDataSource.getWelcomeText()
    }
}