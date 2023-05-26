package com.ivyapps.material3showcase.component.chip

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
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
    group = "Input Chip",
    widthDp = 230,
    heightDp = 120,
)
@Composable
fun InputChipDefault() {
    ShowcasePreview(width = 230, height = 120) {
        var selected by remember { mutableStateOf(false) }

        Column {
            InputChip(
                selected = selected,
                onClick = { selected = !selected },
                label = { Text("Person") },
                avatar = {
                    Icon(
                        Icons.Filled.Person,
                        contentDescription = "Person",
                        Modifier.size(InputChipDefaults.AvatarSize)
                    )
                }
            )

            InputChip(
                selected = !selected,
                onClick = { selected = !selected },
                label = { Text("Person") },
                avatar = {
                    Icon(
                        modifier = Modifier.size(InputChipDefaults.AvatarSize),
                        imageVector = Icons.Filled.Person,
                        contentDescription = "Person"
                    )
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Input Chip",
    widthDp = 230,
    heightDp = 120,
)
@Composable
fun InputChipCustom() {
    ShowcasePreview(width = 230, height = 120) {
        var selected by remember { mutableStateOf(false) }

        InputChip(
            modifier = Modifier,
            selected = selected,
            onClick = { selected = !selected },
            label = { Text("Input") },
            avatar = {
                Icon(
                    modifier = Modifier.size(InputChipDefaults.AvatarSize),
                    imageVector = Icons.Filled.Person,
                    contentDescription = "Person"
                )
            },
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = InputChipDefaults.inputChipColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                labelColor = MaterialTheme.colorScheme.onPrimaryContainer,
                disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                disabledLabelColor = MaterialTheme.colorScheme.onSecondaryContainer,
                selectedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                disabledSelectedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                selectedLabelColor = MaterialTheme.colorScheme.onSecondaryContainer
            )
        )
    }
}