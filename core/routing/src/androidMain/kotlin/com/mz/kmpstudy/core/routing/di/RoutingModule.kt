package com.mz.kmpstudy.core.routing.di

import com.mz.kmpstudy.core.routing.navigation.RouteNavigator
import com.mz.kmpstudy.core.routing.navigation.RouteNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RoutingModule {

    @Binds
    @Singleton
    abstract fun bindRouteNavigator(
        routeNavigatorImpl: RouteNavigatorImpl,
    ): RouteNavigator
}