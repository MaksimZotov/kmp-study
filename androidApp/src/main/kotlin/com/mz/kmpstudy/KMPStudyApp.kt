package com.mz.kmpstudy

import android.app.Application
import com.mz.kmpstudy.core.app.koin.KoinInitializer

class KMPStudyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        KoinInitializer(applicationContext).init()
    }
}