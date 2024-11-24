package com.mz.kmpstudy.core.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun KSCounter(
    modifier: Modifier = Modifier,
    value: Int,
    incrementText: String,
    decrementText: String,
    onClickIncrement: () -> Unit,
    onClickDecrement: () -> Unit,
) {
    Column(
        modifier = Modifier
            .height(106.dp)
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(5)
            )
            .padding(8.dp)
            .then(modifier),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Box(
            modifier = Modifier
                .height(40.dp)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(50)
                )
                .padding(8.dp)
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center),
                textAlign = TextAlign.Center,
                color = Color.Black,
                text = value.toString(),
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            KSButton(
                modifier = Modifier.weight(1f),
                text = decrementText,
                onClick = onClickDecrement,
            )
            KSButton(
                modifier = Modifier.weight(1f),
                text = incrementText,
                onClick = onClickIncrement,
            )
        }
    }
}

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