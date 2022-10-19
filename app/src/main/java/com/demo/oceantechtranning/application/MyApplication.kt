package com.demo.oceantechtranning.application

import android.app.Application
import com.demo.oceantechtranning.dagger.component.DaggerApiComponent

class MyApplication: Application() {

    var componentApi = DaggerApiComponent.create()

    override fun onCreate() {
        super.onCreate()

        componentApi.injectAplication(this)
    }


}