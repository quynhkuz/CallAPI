package com.demo.oceantechtranning.dagger.component

import com.demo.oceantechtranning.MainActivity
import com.demo.oceantechtranning.application.MyApplication
import com.demo.oceantechtranning.dagger.module.APIModul
import dagger.Component


@Component(modules = [APIModul::class])
interface ApiComponent {

    fun getMainActiviti(mainActivity: MainActivity)

    fun injectAplication(myApplication: MyApplication)

}
