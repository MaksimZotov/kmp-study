package com.mz.kmpstudy.feature.home.di

import com.mz.kmpstudy.feature.home.ui.HomeViewModel
import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureHomeModule = module {
    viewModel {
        HomeViewModel(
            routeNavigator = get(),
            counterRepository = get()
        )
    }
}