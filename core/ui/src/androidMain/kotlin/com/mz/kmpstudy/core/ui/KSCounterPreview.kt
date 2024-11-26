package com.mz.kmpstudy.core.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(
    widthDp = 300,
    heightDp = 200
)
private fun KSCounterPreview() {
    MaterialTheme {
        Box {
            KSCounter(
                value = 0,
                incrementText = "+1",
                decrementText = "-1",
                onClickIncrement = {},
                onClickDecrement = {},
            )
        }
    }
}