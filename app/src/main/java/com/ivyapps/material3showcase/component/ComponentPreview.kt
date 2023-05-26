package com.ivyapps.material3showcase.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ivyapps.material3showcase.ui.theme.Material3ShowcaseTheme

const val showkaseWidth = 212
const val showkaseHeight = 64

@Preview(showBackground = true)
annotation class ComponentPreview

@Composable
fun ShowcasePreview(
    width: Int = showkaseWidth,
    height: Int = showkaseHeight,
    darkModeBelow: Boolean = false,
    hideDarkMode: Boolean = false,
    content: @Composable () -> Unit
) {
    if (darkModeBelow) {
        Column(
            modifier = Modifier
                .width((width * 2).dp)
                .height(height.dp)
                .border(1.dp, Color.Gray)
        ) {
            Material3ShowcaseTheme {
                Surface(
                    modifier = Modifier
                        .weight(1f)
                        .height(height.dp)
                ) {
                    Box(
                        modifier = Modifier,
                        contentAlignment = Alignment.Center
                    ) {
                        content()
                    }
                }
            }
            if (!hideDarkMode) {
                Material3ShowcaseTheme(
                    darkTheme = true
                ) {
                    Surface(
                        modifier = Modifier
                            .weight(1f)
                            .height(height.dp)
                            .background(MaterialTheme.colorScheme.background)
                    ) {
                        Box(
                            modifier = Modifier,
                            contentAlignment = Alignment.Center
                        ) {
                            content()
                        }
                    }
                }
            }
        }
    } else {
        Row(
            modifier = Modifier
                .width((width * 2).dp)
                .height(height.dp)
                .border(1.dp, Color.Gray)
        ) {
            Material3ShowcaseTheme {
                Surface(
                    modifier = Modifier
                        .weight(1f)
                        .height(height.dp)
                ) {
                    Box(
                        modifier = Modifier,
                        contentAlignment = Alignment.Center
                    ) {
                        content()
                    }
                }
            }
            if (!hideDarkMode) {
                Material3ShowcaseTheme(
                    darkTheme = true
                ) {
                    Surface(
                        modifier = Modifier
                            .weight(1f)
                            .height(height.dp)
                            .background(MaterialTheme.colorScheme.background)
                    ) {
                        Box(
                            modifier = Modifier,
                            contentAlignment = Alignment.Center
                        ) {
                            content()
                        }
                    }
                }
            }
        }
    }
}