package com.ivyapps.material3showcase.component.animations

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AnimationsContent() {
    var visible by remember { mutableStateOf(false) }
    LazyColumn {
        item {
            Switch(checked = visible, onCheckedChange = { visible = !visible })
        }
        item {
            Crossfade(
                targetState = visible,
                label = "crossfade content"
            ) { state ->
                when (state) {
                    true -> {
                        Content(text = "Text B", color = Color.Green)
                    }

                    else -> {
                        Content(text = "Text A", color = Color.Red)
                    }
                }
            }
        }
    }
}

@Composable
private fun Content(
    text: String,
    color: Color,
) {
    Text(
        modifier = Modifier
            .size(120.dp)
            .background(color)
            .padding(all = 16.dp),
        text = text,
    )
}