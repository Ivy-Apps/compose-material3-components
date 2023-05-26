package com.ivyapps.material3showcase.component.chips

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview
import com.ivyapps.material3showcase.component.showkaseHeight
import com.ivyapps.material3showcase.component.showkaseWidth

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Filter Chip",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun FilterChipDefault() {
    ShowcasePreview {
        var selected by remember { mutableStateOf(true) }

        FilterChip(
            selected = selected,
            onClick = { selected = !selected },
            label = { Text("Filter chip") },
            leadingIcon = if (selected) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Filter Chip",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun FilterChipCustom() {
    ShowcasePreview {
        var selected by remember { mutableStateOf(true) }

        FilterChip(
            selected = selected,
            onClick = { selected = !selected },
            label = { Text("Filter chip") },
            leadingIcon = if (selected) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Done",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            }
        )
    }
}