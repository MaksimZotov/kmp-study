package com.mz.kmpstudy.feature.counter.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun CounterScreenHolder(viewModel: CounterViewModel) {
    val count by viewModel.count.collectAsStateWithLifecycle()
    CounterScreen(
        count = count,
        onClickIncrement = viewModel::increment,
        onClickDecrement = viewModel::decrement,
    )
}