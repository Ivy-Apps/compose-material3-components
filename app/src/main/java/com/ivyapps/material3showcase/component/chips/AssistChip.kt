package com.ivyapps.material3showcase.component.chips

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
    group = "Assist Chip",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun AssistChipDefault() {
    ShowcasePreview {
        AssistChip(
            onClick = {
                /* Do something! */
            },
            label = {
                Text("Text")
            },
            leadingIcon = {
                Icon(
                    Icons.Filled.Settings,
                    contentDescription = "Settings",
                    Modifier.size(AssistChipDefaults.IconSize)
                )
            }
        )
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Assist Chip",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun AssistChipCustom() {
    ShowcasePreview {
        AssistChip(
            modifier = Modifier,
            onClick = {
                /* Do something! */
            },
            label = {
                Text("Text")
            },
            leadingIcon = {
                Icon(
                    Icons.Filled.Settings,
                    contentDescription = "Settings",
                    Modifier.size(AssistChipDefaults.IconSize)
                )
            },
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = AssistChipDefaults.assistChipColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                labelColor = MaterialTheme.colorScheme.onPrimaryContainer,
                leadingIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                disabledLabelColor = MaterialTheme.colorScheme.onSecondaryContainer,
                disabledLeadingIconContentColor = MaterialTheme.colorScheme.onSecondaryContainer
            ),
            border = AssistChipDefaults.assistChipBorder(
                borderColor = MaterialTheme.colorScheme.secondary,
                disabledBorderColor = MaterialTheme.colorScheme.tertiary,
                borderWidth = 1.dp
            )
        )
    }
}