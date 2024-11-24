package com.mz.kmpstudy.core.routing.navigation

import kotlinx.coroutines.flow.Flow

interface RouteNavigator {

    val navEvent: Flow<NavEvent>

    fun navigateToRoute(route: String)
}