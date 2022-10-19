package com.demo.oceantechtranning

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.demo.oceantechtranning.application.MyApplication
import com.demo.oceantechtranning.network.RemoteDataSource
import com.demo.oceantechtranning.model.TokenResponse
import com.demo.oceantechtranning.network.UserApi
import com.globits.mita.data.model.UserCredentials
import com.globits.mita.data.network.AuthApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var remoteDataSource: RemoteDataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MyApplication).componentApi.getMainActiviti(this)
    }

    override fun onStart() {
        super.onStart()
        val api = remoteDataSource.buildApi(UserApi::class.java, this)
        api.getCurrentUser().execute()
//                enqueue(object :Callback<Unit>{
//            override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onFailure(call: Call<Unit>, t: Throwable) {
//                TODO("Not yet implemented")
//            }
//
//        })
//        api.oauth(
//            UserCredentials(
//                AuthApi.CLIENT_ID,
//                AuthApi.CLIENT_SECRET,
//                "admin",
//                "admin",
//                null,
//                AuthApi.GRANT_TYPE_PASSWORD
//            )
//        ).enqueue(object :Callback<TokenResponse>{
//            override fun onResponse(call: Call<TokenResponse>, response: Response<TokenResponse>) {
//                Log.d("AAA", response.body()?.accessToken.toString())
//                Log.d("AAA", response.body()?.refreshToken.toString())
//
//            }
//
//            override fun onFailure(call: Call<TokenResponse>, t: Throwable) {
//                TODO("Not yet implemented")
//            }
//
//        })
    }
}