package com.mz.kmpstudy.feature.home.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mz.kmpstudy.core.ui.KSButton
import com.mz.kmpstudy.core.ui.KSCounterItem
import kmp_study.core.resources.generated.resources.Res
import kmp_study.core.resources.generated.resources.add
import kotlinx.collections.immutable.ImmutableList
import org.jetbrains.compose.resources.stringResource

@Composable
fun HomeScreen(
    counters: ImmutableList<Pair<String, Int>>,
    onClickCounter: (String) -> Unit,
    onClickAdd: () -> Unit,
) {
    Scaffold { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    KSButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = stringResource(Res.string.add),
                        onClick = onClickAdd
                    )
                }
            }
            item { Spacer(modifier = Modifier.height(8.dp)) }
            items(counters) {(name, value) ->
                Box(
                    modifier = Modifier.padding(8.dp)
                ) {
                    KSCounterItem(
                        name = name,
                        value = value,
                        onClick = {
                            onClickCounter(name)
                        }
                    )
                }
            }
        }
    }
}