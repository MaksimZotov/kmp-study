package com.mz.kmpstudy.feature.home.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.collections.immutable.persistentListOf

@Composable
@Preview
fun HomeScreenPreview() {
    MaterialTheme {
        HomeScreen(
            counters = persistentListOf(
                "Текст 1" to 1,
                "Текст 2" to 2,
            ),
            onClickCounter = {},
            onClickAdd = {},
        )
    }
}