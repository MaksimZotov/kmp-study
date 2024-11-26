package com.mz.kmpstudy.core.routing.navigation

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

class RouteNavigatorImpl : RouteNavigator {

    private val _navEvent = MutableSharedFlow<NavEvent>(
        extraBufferCapacity = 1
    )

    override val navEvent = _navEvent.asSharedFlow()

    override fun navigateToRoute(route: String) = navigate(NavEvent.NavigateToRoute(route))

    private fun navigate(navEvent: NavEvent) {
        _navEvent.tryEmit(navEvent)
    }
}