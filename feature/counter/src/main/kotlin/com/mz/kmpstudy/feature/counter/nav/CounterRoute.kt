package com.mz.kmpstudy.feature.counter.nav

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.mz.kmpstudy.core.routing.navigation.NavRoute
import com.mz.kmpstudy.core.routing.routes.Routes
import com.mz.kmpstudy.feature.counter.ui.CounterScreenHolder
import com.mz.kmpstudy.feature.counter.ui.CounterViewModel

object CounterRoute : NavRoute<CounterViewModel> {

    override val route = Routes.COUNTER

    @Composable
    override fun viewModel(): CounterViewModel = hiltViewModel()

    @Composable
    override fun Content(viewModel: CounterViewModel) = CounterScreenHolder(viewModel)
}