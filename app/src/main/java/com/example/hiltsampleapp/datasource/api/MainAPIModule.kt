package com.example.hiltsampleapp.datasource.api

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object MainAPIModule {
    @Provides
    fun provideMainAPI(): MainAPI {
        return object : MainAPI {}
    }
}