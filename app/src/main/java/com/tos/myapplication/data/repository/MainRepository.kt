package com.tos.myapplication.data.repository

import com.tos.myapplication.data.api.ApiHelper

/**
 *Created by tarikul on 5/9/20
 */
class MainRepository(val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}