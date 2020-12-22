package com.example.hiltsampleapp.datasource.api

import javax.inject.Inject

class MainRemoteDataSourceImpl @Inject constructor(
    private val mainAPI: MainAPI
) : MainRemoteDataSource