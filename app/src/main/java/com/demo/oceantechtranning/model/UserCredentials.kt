package com.globits.mita.data.model

import com.globits.mita.data.network.AuthApi
import com.google.gson.annotations.SerializedName

data class UserCredentials @JvmOverloads constructor(

    @SerializedName("client_id")
    val clientId: String = AuthApi.CLIENT_ID,

    @SerializedName("client_secret")
    val clientSecret: String = AuthApi.CLIENT_SECRET,

    @SerializedName("username")
    val username: String? = AuthApi.USERNAME,

    @SerializedName("password")
    val password: String? = AuthApi.PASSWORD,

    @SerializedName("refresh_token")
    val refreshToken: String? = null,

    @SerializedName("grant_type")
    val grantType: String = AuthApi.GRANT_TYPE_PASSWORD
)