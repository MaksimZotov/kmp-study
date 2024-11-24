package com.mz.kmpstudy.core.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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

@Composable
@Preview(
    widthDp = 300,
    heightDp = 100
)
private fun KSButtonPreview() {
    MaterialTheme {
        Box {
            KSButton(
                text = "Кнопка",
                onClick = {}
            )
        }
    }
}