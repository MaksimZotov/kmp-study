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
private fun KSCounterItemPreview() {
    MaterialTheme {
        Box {
            KSCounterItem(
                name = "Текст",
                value = 0,
                onClick = {},
            )
        }
    }
}