package com.mz.kmpstudy.core.app

import androidx.compose.ui.window.ComposeUIViewController
import com.mz.kmpstudy.core.app.koin.KoinInitializer
import org.koin.compose.getKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        KoinInitializer().init()
    },
    content = {
        getKoin().get<AppProvider>().App()
    }
)