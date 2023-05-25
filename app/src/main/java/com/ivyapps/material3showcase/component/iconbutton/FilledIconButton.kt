package com.ivyapps.material3showcase.component.iconbutton

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
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
    group = "Filled Icon Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun FilledIconButtonDefault() {
    ShowcasePreview {
        FilledIconButton(
            onClick = {
                /* doSomething() */
            }
        ) {
            Icon(
                imageVector = Icons.Outlined.Lock,
                contentDescription = "Lock"
            )
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Filled Icon Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun FilledIconButtonCustom() {
    ShowcasePreview {
        FilledIconButton(
            onClick = {
                /* doSomething() */
            },
            modifier = Modifier,
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = IconButtonDefaults.filledIconButtonColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                disabledContainerColor = MaterialTheme.colorScheme.primaryContainer,
                disabledContentColor = MaterialTheme.colorScheme.onPrimaryContainer
            )
        ) {
            Icon(
                imageVector = Icons.Outlined.Lock,
                contentDescription = "Lock"
            )
        }
    }
}