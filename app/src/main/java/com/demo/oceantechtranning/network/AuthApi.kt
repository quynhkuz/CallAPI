package com.globits.mita.data.network

import com.demo.oceantechtranning.model.TokenResponse
import com.globits.mita.data.model.UserCredentials
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("oauth/token")
    fun loginWithRefreshToken(@Body credentials: UserCredentials):Call<TokenResponse>
    @POST("oauth/token")
    fun oauth(@Body credentials: UserCredentials): Call<TokenResponse>
    companion object {
        val CLIENT_ID = "core_client" //"core_client"

        val CLIENT_SECRET = "secret" //"secret"

        val GRANT_TYPE_PASSWORD = "password"

        val USERNAME = "admin"

        val PASSWORD = "admin"

        val GRANT_TYPE_REFRESH = "refresh_token"

        val DEFAULT_SCOPES = "read write delete"
    }
}