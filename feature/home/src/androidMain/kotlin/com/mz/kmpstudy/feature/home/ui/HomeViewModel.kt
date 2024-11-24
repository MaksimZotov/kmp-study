package com.mz.kmpstudy.feature.home.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ru.mz.kmpstudy.client.counter.CounterRepository
import com.mz.kmpstudy.core.routing.navigation.RouteNavigator
import com.mz.kmpstudy.core.routing.routes.Routes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val routeNavigator: RouteNavigator,
    private val counterRepository: CounterRepository,
) : ViewModel(), RouteNavigator by routeNavigator {

    val counters = counterRepository.getCountersFlow().map { map ->
        map.toList().toImmutableList()
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = persistentListOf()
    )

    fun onClickAdd() {
        navigateToCounter(
            counterName = counterRepository.addNewCounter()
        )
    }

    fun navigateToCounter(counterName: String) {
        navigateToRoute(
            route = Routes.getCounterRoute(
                counterName = counterName
            )
        )
    }
}