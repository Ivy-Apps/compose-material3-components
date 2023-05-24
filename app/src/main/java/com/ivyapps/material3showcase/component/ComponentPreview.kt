package com.ivyapps.material3showcase.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ivyapps.material3showcase.ui.theme.Material3ShowcaseTheme

@Preview(
    showBackground = true,
)
annotation class ComponentPreview

@Composable
fun ShowcasePreview(content: @Composable () -> Unit) {
    Material3ShowcaseTheme {
        Surface {
            Box(
                modifier = Modifier.size(width = 300.dp, height = 150.dp),
                contentAlignment = Alignment.Center
            ) {
                content()
            }
        }
    }
}