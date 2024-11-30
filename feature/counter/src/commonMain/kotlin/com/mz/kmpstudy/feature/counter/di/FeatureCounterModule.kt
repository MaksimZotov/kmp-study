package com.mz.kmpstudy.feature.counter.di

import androidx.lifecycle.SavedStateHandle
import com.mz.kmpstudy.feature.counter.ui.CounterViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val featureCounterModule = module {
    viewModel { (handle: SavedStateHandle) ->
        CounterViewModel(
            savedStateHandle = handle,
            routeNavigator = get(),
            counterRepository = get()
        )
    }
}