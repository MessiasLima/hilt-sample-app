package com.example.hiltsampleapp.datasource

import com.example.hiltsampleapp.datasource.api.MainRemoteDataSource
import com.example.hiltsampleapp.datasource.api.MainRemoteDataSourceImpl
import com.example.hiltsampleapp.datasource.local.MainLocalDataSource
import com.example.hiltsampleapp.datasource.local.MainLocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindRemoteDataSource(
        remoteDataSourceImpl: MainRemoteDataSourceImpl
    ): MainRemoteDataSource

    @Binds
    abstract fun bindLocalDataSource(
        localDataSourceImpl: MainLocalDataSourceImpl
    ): MainLocalDataSource
}