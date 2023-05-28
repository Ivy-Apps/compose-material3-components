package com.ivyapps.material3showcase.component.switchbtn

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview
import com.ivyapps.material3showcase.component.showkaseHeight
import com.ivyapps.material3showcase.component.showkaseWidth

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Switch",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun SwitchDefault() {
    ShowcasePreview {
        var checked by remember { mutableStateOf(true) }

        Switch(
            modifier = Modifier.semantics { contentDescription = "Switch" },
            checked = checked,
            onCheckedChange = { checked = it }
        )
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Switch",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun SwitchCustom() {
    ShowcasePreview {
        var checked by remember { mutableStateOf(true) }
// Icon isn't focusable, no need for content description
        val icon: (@Composable () -> Unit)? = if (checked) {
            {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = "Check",
                    modifier = Modifier.size(SwitchDefaults.IconSize)
                )
            }
        } else {
            null
        }

        Switch(
            modifier = Modifier.semantics { contentDescription = "Demo with icon" },
            checked = checked,
            onCheckedChange = { checked = it },
            thumbContent = icon,
            enabled = true,
            colors = SwitchDefaults.colors()
        )
    }
}