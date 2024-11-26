package com.mz.kmpstudy.core.koin

import org.koin.core.context.startKoin

actual class KoinInitializer {
    actual fun init() {
        startKoin {
            modules(ModulesProvider.getModules())
        }
    }
}