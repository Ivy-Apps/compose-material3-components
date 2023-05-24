package com.ivyapps.material3showcase.component.fab

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
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
    group = "Floating Action Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun ElevatedButtonDefault() {
    ShowcasePreview {
        FloatingActionButton(
            onClick = {
                /* Do something! */
            }
        ) {
            Icon(
                imageVector = Icons.Default.Create,
                contentDescription = "Create"
            )
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Floating Action Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun ElevatedButtonCustom() {
    ShowcasePreview {
        FloatingActionButton(
            onClick = {
                /* Do something! */
            },
            modifier = Modifier,
            shape = RoundedCornerShape(12.dp),
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            elevation = FloatingActionButtonDefaults.elevation(5.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Create,
                contentDescription = "Create"
            )
        }
    }
}