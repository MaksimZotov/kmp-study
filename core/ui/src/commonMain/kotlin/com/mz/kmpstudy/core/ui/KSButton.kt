package com.mz.kmpstudy.core.ui

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun KSButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
) {
    Button(
        modifier = Modifier
            .height(40.dp)
            .then(modifier),
        onClick = {
            onClick()
        }
    ) {
        Text(
            text = text,
        )
    }
}