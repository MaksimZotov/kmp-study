package com.mz.kmpstudy.core.routing.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

interface NavRoute<T : RouteNavigator> {

    val route: String

    @Composable
    fun Content(viewModel: T)

    @Composable
    fun viewModel(): T

    fun getArguments(): List<NamedNavArgument> = listOf()

    fun composable(
        builder: NavGraphBuilder,
        navController: NavHostController,
        customNavArguments: List<NamedNavArgument>? = null
    ) {
        builder.composable(route, customNavArguments ?: getArguments()) {
            val viewModel = viewModel()
            viewModel.navEvent.collectAsEffect { navEvent ->
                sendNavEvent(
                    navController = navController,
                    navEvent = navEvent
                )
            }
            Content(viewModel)
        }
    }


    private fun sendNavEvent(
        navController: NavHostController,
        navEvent: NavEvent
    ) {
        when (navEvent) {
            is NavEvent.NavigateToRoute -> navController.navigate(navEvent.route)
        }
    }

    @Composable
    private fun <T> Flow<T>.collectAsEffect(
        context: CoroutineContext = EmptyCoroutineContext,
        block: (T) -> Unit
    ) {
        LaunchedEffect(Unit) {
            onEach(block).flowOn(context).launchIn(this)
        }
    }
}