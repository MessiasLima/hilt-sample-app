package com.example.hiltsampleapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.hiltsampleapp.datasource.DataSourceModule
import com.example.hiltsampleapp.datasource.api.MainRemoteDataSource
import com.example.hiltsampleapp.datasource.local.MainLocalDataSource
import dagger.hilt.android.testing.BindValue
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.junit.Rule
import org.junit.Test

@UninstallModules(DataSourceModule::class)
@HiltAndroidTest
class MainActivityTest {
    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @BindValue
    @JvmField
    val fakeLocalDataSource: MainLocalDataSource = object : MainLocalDataSource {
        override suspend fun getWelcomeText() = TEST_WELCOME_TEXT
    }

    @BindValue
    @JvmField
    val fakeRemoteDataSource: MainRemoteDataSource = object : MainRemoteDataSource {}

    @Test
    fun shouldShowTheWelcomeText() {
        onView(withId(R.id.welcomeMessageTextView)).check(matches(withText(TEST_WELCOME_TEXT)))
    }

    companion object {
        private const val TEST_WELCOME_TEXT = "Injection of mock works!"
    }
}