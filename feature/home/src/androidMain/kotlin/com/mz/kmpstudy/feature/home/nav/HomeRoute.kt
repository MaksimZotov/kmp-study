package com.mz.kmpstudy.feature.home.nav

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.mz.kmpstudy.core.routing.navigation.NavRoute
import com.mz.kmpstudy.core.routing.routes.Routes
import com.mz.kmpstudy.feature.home.ui.HomeScreenHolder
import com.mz.kmpstudy.feature.home.ui.HomeViewModel

object HomeRoute : NavRoute<HomeViewModel> {

    override val route = Routes.HOME

    @Composable
    override fun viewModel(): HomeViewModel = hiltViewModel()

    @Composable
    override fun Content(viewModel: HomeViewModel) = HomeScreenHolder(viewModel)
}