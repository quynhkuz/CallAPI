package com.demo.oceantechtranning.network

import retrofit2.Call
import retrofit2.http.GET

interface UserApi {
    @GET("api/users/getCurrentUser")
    fun getCurrentUser(): Call<Unit>
}