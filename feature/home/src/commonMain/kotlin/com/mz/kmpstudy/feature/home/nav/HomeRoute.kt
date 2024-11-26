package com.mz.kmpstudy.feature.home.nav

import androidx.compose.runtime.Composable
import com.mz.kmpstudy.core.routing.navigation.NavRoute
import com.mz.kmpstudy.core.routing.routes.Routes
import com.mz.kmpstudy.feature.home.ui.HomeScreenHolder
import com.mz.kmpstudy.feature.home.ui.HomeViewModel
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

object HomeRoute : NavRoute<HomeViewModel> {

    override val route = Routes.HOME

    @OptIn(KoinExperimentalAPI::class)
    @Composable
    override fun viewModel(): HomeViewModel = koinViewModel()

    @Composable
    override fun Content(viewModel: HomeViewModel) = HomeScreenHolder(viewModel)
}