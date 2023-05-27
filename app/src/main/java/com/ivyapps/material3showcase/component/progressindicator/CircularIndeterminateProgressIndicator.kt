package com.ivyapps.material3showcase.component.progressindicator

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview
import com.ivyapps.material3showcase.component.showkaseHeight
import com.ivyapps.material3showcase.component.showkaseWidth

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Circular Indeterminate Progress Indicator",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun CircularIndeterminateProgressIndicatorDefault() {
    ShowcasePreview {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            CircularProgressIndicator()
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Circular Indeterminate Progress Indicator",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun CircularIndeterminateProgressIndicatorCustom() {
    ShowcasePreview {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CircularProgressIndicator(
                modifier = Modifier,
                strokeWidth = 4.dp,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                trackColor = MaterialTheme.colorScheme.primaryContainer,
                strokeCap = ProgressIndicatorDefaults.LinearStrokeCap
            )
        }
    }
}