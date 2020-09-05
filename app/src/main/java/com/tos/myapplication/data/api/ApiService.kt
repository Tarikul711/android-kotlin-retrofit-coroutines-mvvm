package com.tos.myapplication.data.api

import com.tos.myapplication.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}