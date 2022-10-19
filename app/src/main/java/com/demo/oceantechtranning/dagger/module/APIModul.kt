package com.demo.oceantechtranning.dagger.module

import com.demo.oceantechtranning.network.RemoteDataSource
import dagger.Module
import dagger.Provides


@Module
class APIModul {

    @Provides
   fun getRemoteDataSource():RemoteDataSource
   {
       return RemoteDataSource()
   }

}