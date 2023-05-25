package com.ivyapps.material3showcase.component.fab

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Extended Floating Action Button",
    widthDp = 312,
    heightDp = 72,
)
@Composable
fun ExtendedFloatingActionButtonDefault() {
    ShowcasePreview(
        width = 312,
        height = 72,
    ) {
        ExtendedFloatingActionButton(
            onClick = {
                /* do something */
            }
        ) {
            Icon(
                imageVector = Icons.Default.Create,
                contentDescription = "Create",
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(text = "Compose")
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Extended Floating Action Button",
    widthDp = 312,
    heightDp = 72,
)
@Composable
fun ExtendedFloatingActionButtonCustom() {
    ShowcasePreview(
        width = 312,
        height = 72,
    ) {
        ExtendedFloatingActionButton(
            onClick = {
                /* do something */
            },
            modifier = Modifier,
            shape = FloatingActionButtonDefaults.extendedFabShape,
            containerColor = FloatingActionButtonDefaults.containerColor,
            contentColor = contentColorFor(FloatingActionButtonDefaults.containerColor),
            elevation = FloatingActionButtonDefaults.elevation(4.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Create,
                contentDescription = "Create",
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(text = "Compose")
        }
    }
}