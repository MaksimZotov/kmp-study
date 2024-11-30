package com.mz.kmpstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.mz.kmpstudy.core.app.AppProvider
import org.koin.java.KoinJavaComponent.inject

class MainActivity : ComponentActivity() {

    private val appProvider: AppProvider by inject(AppProvider::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            appProvider.App()
        }
    }
}