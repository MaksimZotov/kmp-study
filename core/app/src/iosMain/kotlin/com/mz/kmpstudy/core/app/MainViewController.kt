package com.mz.kmpstudy.core.app

import androidx.compose.ui.window.ComposeUIViewController
import com.mz.kmpstudy.core.app.koin.KoinInitializer
import org.koin.compose.getKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        enforceStrictPlistSanityCheck = false
        KoinInitializer().init()
    },
    content = {
        getKoin().get<AppProvider>().App()
    }
)