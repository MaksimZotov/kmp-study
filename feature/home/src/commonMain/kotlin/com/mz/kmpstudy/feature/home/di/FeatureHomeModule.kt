package com.mz.kmpstudy.feature.home.di

import com.mz.kmpstudy.client.counter.CounterRepository
import com.mz.kmpstudy.core.routing.navigation.RouteNavigator
import com.mz.kmpstudy.feature.home.ui.HomeViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val featureHomeModule = module {
    viewModel {
        HomeViewModel(
            routeNavigator = get(),
            counterRepository = get()
        )
    }
}