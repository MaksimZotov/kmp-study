package com.mz.kmpstudy.feature.counter.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mz.kmpstudy.client.counter.CounterRepository
import com.mz.kmpstudy.core.routing.navigation.RouteNavigator
import com.mz.kmpstudy.core.routing.routes.COUNTER_NAME
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn

class CounterViewModel(
    savedStateHandle: SavedStateHandle,
    private val routeNavigator: RouteNavigator,
    private val counterRepository: CounterRepository,
) : ViewModel(), RouteNavigator by routeNavigator {

    private val counterName =
        checkNotNull(savedStateHandle.get<String>(COUNTER_NAME))

    val count = counterRepository.getCounterFlow(counterName).stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = null
    )

    fun increment() {
        counterRepository.increment(counterName)
    }

    fun decrement() {
        counterRepository.decrement(counterName)
    }
}