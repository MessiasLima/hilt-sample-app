package com.example.hiltsampleapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.hiltsampleapp.datasource.local.MainLocalDataSourceImpl
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class MainActivityTest{
    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun shouldShowTheWelcomeText(){
        Thread.sleep(1000)
        onView(withId(R.id.welcomeMessageTextView))
            .check(matches(withText(MainLocalDataSourceImpl.WELCOME_TEXT)))
    }
}