package com.mz.kmpstudy.feature.counter.nav

import androidx.compose.runtime.Composable
import com.mz.kmpstudy.core.routing.navigation.NavRoute
import com.mz.kmpstudy.core.routing.routes.Routes
import com.mz.kmpstudy.feature.counter.ui.CounterScreenHolder
import com.mz.kmpstudy.feature.counter.ui.CounterViewModel
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

object CounterRoute : NavRoute<CounterViewModel> {

    override val route = Routes.COUNTER

    @OptIn(KoinExperimentalAPI::class)
    @Composable
    override fun viewModel(): CounterViewModel = koinViewModel()

    @Composable
    override fun Content(viewModel: CounterViewModel) = CounterScreenHolder(viewModel)
}