package com.ivyapps.material3showcase.component.progressindicator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview
import com.ivyapps.material3showcase.component.showkaseHeight
import com.ivyapps.material3showcase.component.showkaseWidth

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Linear Indeterminate Progress Indicator",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun LinearIndeterminateProgressIndicatorDefault() {
    ShowcasePreview {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            LinearProgressIndicator(
                modifier = Modifier
                    .semantics(mergeDescendants = true) {}
                    .padding(10.dp)
            )
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Linear Indeterminate Progress Indicator",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun LinearIndeterminateProgressIndicatorCustom() {
    ShowcasePreview {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LinearProgressIndicator(
                modifier = Modifier
                    .semantics(mergeDescendants = true) {}
                    .padding(10.dp),
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                trackColor = MaterialTheme.colorScheme.primaryContainer,
                strokeCap = ProgressIndicatorDefaults.LinearStrokeCap
            )
        }
    }
}