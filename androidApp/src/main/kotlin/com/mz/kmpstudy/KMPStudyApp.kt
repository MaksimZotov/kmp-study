package com.mz.kmpstudy

import android.app.Application
import com.mz.kmpstudy.core.koin.KoinInitializer

class KMPStudyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        KoinInitializer(applicationContext).init()
    }
}