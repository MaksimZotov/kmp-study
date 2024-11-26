package com.mz.kmpstudy.feature.counter.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mz.kmpstudy.core.ui.KSCounter

@Composable
fun CounterScreen(
    count: Int?,
    onClickIncrement: () -> Unit,
    onClickDecrement: () -> Unit,
) {
    count ?: return
    Scaffold { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(8.dp)
        ) {
            KSCounter(
                modifier = Modifier.align(Alignment.Center),
                value = count,
                incrementText = "stringResource(R.string.plus_1)",
                decrementText = "stringResource(R.string.minus_1)",
                onClickIncrement = onClickIncrement,
                onClickDecrement = onClickDecrement,
            )
        }
    }
}