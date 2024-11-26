package com.mz.kmpstudy.feature.counter.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun CounterScreenPreview() {
    MaterialTheme {
        CounterScreen(
            count = 0,
            onClickIncrement = {},
            onClickDecrement = {},
        )
    }
}