package com.example.hiltsampleapp.datasource.local

import javax.inject.Inject

class MainLocalDataSourceImpl @Inject constructor(
    @RealmDAO private val mainDAO: MainDAO
) : MainLocalDataSource