package com.mz.kmpstudy.core.routing.navigation

sealed interface NavEvent  {
    data class NavigateToRoute(val route: String) : NavEvent
}