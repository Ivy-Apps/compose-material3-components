package com.ivyapps.material3showcase.component.fab

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview
import com.ivyapps.material3showcase.component.showkaseWidth

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Large Floating Action Button",
    widthDp = showkaseWidth,
    heightDp = 120,
)
@Composable
fun LargeFloatingActionButtonDefault() {
    ShowcasePreview(height = 120) {
        LargeFloatingActionButton(
            onClick = {
                /* do something */
            }
        ) {
            Icon(
                Icons.Filled.Add,
                contentDescription = "Localized description",
                modifier = Modifier.size(FloatingActionButtonDefaults.LargeIconSize),
            )
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Large Floating Action Button",
    widthDp = showkaseWidth,
    heightDp = 120,
)
@Composable
fun LargeFloatingActionButtonCustom() {
    ShowcasePreview(height = 120) {
        LargeFloatingActionButton(
            onClick = {
                /* do something */
            },
            modifier = Modifier,
            shape = FloatingActionButtonDefaults.largeShape,
            containerColor = FloatingActionButtonDefaults.containerColor,
            contentColor = contentColorFor(FloatingActionButtonDefaults.containerColor),
            elevation = FloatingActionButtonDefaults.elevation(4.dp)
        ) {
            Icon(
                Icons.Filled.Add,
                contentDescription = "Localized description",
                modifier = Modifier.size(FloatingActionButtonDefaults.LargeIconSize),
            )
        }
    }
}