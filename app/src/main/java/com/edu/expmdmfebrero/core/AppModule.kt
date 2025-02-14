package com.edu.expmdmfebrero.core

import com.google.gson.Gson
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single


@Module
@ComponentScan("com.edu.expmdmfebrero")
class AppModule {

    @Single
    fun provideGson():Gson = Gson()

}