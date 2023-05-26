package com.ivyapps.material3showcase.component.chip

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Filter Chip",
    widthDp = 230,
    heightDp = 120,
)
@Composable
fun FilterChipDefault() {
    ShowcasePreview(width = 230, height = 120) {
        var selected by remember { mutableStateOf(true) }

        Column {
            FilterChip(
                selected = !selected,
                onClick = {
                    selected = !selected
                },
                label = {
                    Text("Remote")
                },
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

            Spacer(modifier = Modifier.height(8.dp))

            FilterChip(
                selected = selected,
                onClick = {
                    selected = !selected
                },
                label = {
                    Text("Remote")
                },
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
}

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Filter Chip",
    widthDp = 230,
    heightDp = 120,
)
@Composable
fun FilterChipCustom() {
    ShowcasePreview(width = 230, height = 120) {
        var selected by remember { mutableStateOf(true) }

        FilterChip(
            modifier = Modifier,
            selected = selected,
            onClick = {
                selected = !selected
            },
            label = {
                Text("Remote")
            },
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
            },
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = FilterChipDefaults.filterChipColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                labelColor = MaterialTheme.colorScheme.onPrimaryContainer,
                iconColor = MaterialTheme.colorScheme.onPrimaryContainer,
                disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                disabledLabelColor = MaterialTheme.colorScheme.onSecondaryContainer,
                disabledLeadingIconColor = MaterialTheme.colorScheme.onSecondaryContainer,
                selectedContainerColor = MaterialTheme.colorScheme.secondary,
                disabledSelectedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                selectedLabelColor = MaterialTheme.colorScheme.onSecondary,
                selectedLeadingIconColor = MaterialTheme.colorScheme.onSecondary
            )
        )
    }
}