package com.ivyapps.material3showcase.component.progressindicator

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview
import com.ivyapps.material3showcase.component.showkaseWidth

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Circular Determinate Progress Indicator",
    widthDp = showkaseWidth,
    heightDp = 220
)
@Composable
fun CircularDeterminateProgressIndicatorDefault() {
    ShowcasePreview(height = 220) {
        var progress by remember { mutableStateOf(0.1f) }
        val animatedProgress by animateFloatAsState(
            targetValue = progress,
            animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec,
            label = "Progress bar"
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            CircularProgressIndicator(progress = animatedProgress)

            Spacer(Modifier.requiredHeight(30.dp))

            OutlinedButton(
                onClick = {
                    if (progress < 1f) progress += 0.1f
                }
            ) {
                Text("Increase")
            }
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Circular Determinate Progress Indicator",
    widthDp = showkaseWidth,
    heightDp = 220
)
@Composable
fun CircularDeterminateProgressIndicatorCustom() {
    ShowcasePreview(height = 220) {
        var progress by remember { mutableStateOf(0.1f) }
        val animatedProgress by animateFloatAsState(
            targetValue = progress,
            animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec,
            label = "Progress bar"
        )

        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CircularProgressIndicator(
                modifier = Modifier,
                strokeWidth = 4.dp,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                trackColor = MaterialTheme.colorScheme.primaryContainer,
                strokeCap = ProgressIndicatorDefaults.LinearStrokeCap,
                progress = animatedProgress
            )

            Spacer(Modifier.requiredHeight(30.dp))

            OutlinedButton(
                onClick = {
                    if (progress < 1f) progress += 0.1f
                }
            ) {
                Text("Increase")
            }
        }
    }
}