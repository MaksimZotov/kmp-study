package com.mz.kmpstudy.core.app.di

import com.mz.kmpstudy.core.app.AppProvider
import org.koin.dsl.module

val coreAppModule = module {
    factory {
        AppProvider()
    }
}