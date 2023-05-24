package com.ivyapps.material3showcase.component.fab

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.contentColorFor
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
    group = "Small Floating Action Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun SmallFloatingActionButtonDefault() {
    ShowcasePreview {
        SmallFloatingActionButton(
            onClick = {
                /* do something */
            },
        ) {
            Icon(
                imageVector = Icons.Filled.Add,
                contentDescription = "Add"
            )
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Small Floating Action Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun SmallFloatingActionButtonCustom() {
    ShowcasePreview {
        SmallFloatingActionButton(
            onClick = {
                /* do something */
            },
            modifier = Modifier,
            shape = FloatingActionButtonDefaults.smallShape,
            containerColor = FloatingActionButtonDefaults.containerColor,
            contentColor = contentColorFor(FloatingActionButtonDefaults.containerColor),
            elevation = FloatingActionButtonDefaults.elevation(4.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Add,
                contentDescription = "Add"
            )
        }
    }
}