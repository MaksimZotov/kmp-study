package com.mz.kmpstudy.core.app.koin

import org.koin.core.context.startKoin

actual class KoinInitializer {
    actual fun init() {
        startKoin {
            modules(ModulesProvider.getModules())
        }
    }
}