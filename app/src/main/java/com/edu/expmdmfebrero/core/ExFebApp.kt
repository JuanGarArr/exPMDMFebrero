package com.edu.expmdmfebrero.core

import android.app.Application
import com.edu.expmdmfebrero.feature.di.AlbumModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin
import org.koin.ksp.generated.module

class ExFebApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ExFebApp)
            modules(
                AppModule().module,
                AlbumModule().module
            )
        }
    }
}