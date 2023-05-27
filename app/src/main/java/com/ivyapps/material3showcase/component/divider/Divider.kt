package com.ivyapps.material3showcase.component.divider

import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
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
    group = "Divider",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun DividerDefault() {
    ShowcasePreview {
        Divider()
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Divider",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun DividerCustom() {
    ShowcasePreview {
        Divider(
            modifier = Modifier,
            thickness = 2.dp,
            color = MaterialTheme.colorScheme.primary
        )
    }
}