package com.example.hiltsampleapp.datasource.local

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object MainDAOModule {
    @RoomDAO
    @Provides
    fun provideRoomDAO(): MainDAO {
        return object : MainDAO {
            override fun getDAOImplementationName() = "Room DAO"
        }
    }

    @RealmDAO
    @Provides
    fun provideRealmDAO(): MainDAO {
        return object : MainDAO {
            override fun getDAOImplementationName() = "Realm DAO"
        }
    }
}