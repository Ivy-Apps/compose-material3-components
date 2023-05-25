package com.ivyapps.material3showcase.component.iconbutton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview
import com.ivyapps.material3showcase.component.showkaseHeight
import com.ivyapps.material3showcase.component.showkaseWidth

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Standard Icon Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun StandardIconButtonDefault() {
    ShowcasePreview {
        IconButton(
            onClick = {
                /* doSomething() */
            }
        ) {
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "Menu"
            )
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Standard Icon Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun StandardIconButtonCustom() {
    ShowcasePreview {
        IconButton(
            onClick = {
                /* doSomething() */
            },
            modifier = Modifier,
            enabled = true,
            colors = IconButtonDefaults.iconButtonColors()
        ) {
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "Menu"
            )
        }
    }
}