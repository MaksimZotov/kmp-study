package com.mz.kmpstudy.core.routing.di

import com.mz.kmpstudy.core.routing.navigation.RouteNavigator
import com.mz.kmpstudy.core.routing.navigation.RouteNavigatorImpl
import org.koin.dsl.module

val coreRoutingModule = module {
    single<RouteNavigator> {
        RouteNavigatorImpl()
    }
}