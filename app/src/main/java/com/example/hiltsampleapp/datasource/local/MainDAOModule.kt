package com.example.hiltsampleapp.datasource.local

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext

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
    fun provideRealmDAO(@ApplicationContext context: Context): MainDAO {
        return object : MainDAO {
            override fun getDAOImplementationName() = "Realm DAO"
        }
    }
}