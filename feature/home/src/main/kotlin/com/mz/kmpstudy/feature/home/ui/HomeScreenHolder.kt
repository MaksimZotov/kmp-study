package com.mz.kmpstudy.feature.home.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun HomeScreenHolder(viewModel: HomeViewModel) {
    val counters by viewModel.counters.collectAsStateWithLifecycle()
    HomeScreen(
        counters = counters,
        onClickCounter = viewModel::navigateToCounter,
        onClickAdd = viewModel::onClickAdd,
    )
}