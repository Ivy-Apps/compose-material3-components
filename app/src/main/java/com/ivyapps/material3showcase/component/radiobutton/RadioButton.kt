package com.ivyapps.material3showcase.component.radiobutton

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
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
    group = "Radio Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun RadioButtonDefault() {
    ShowcasePreview {
        var state by remember { mutableStateOf(true) }

        Row(modifier = Modifier.selectableGroup()) {
            RadioButton(
                selected = state,
                onClick = { state = true },
                modifier = Modifier.semantics { contentDescription = "Option 1" }
            )

            RadioButton(
                selected = !state,
                onClick = { state = false },
                modifier = Modifier.semantics { contentDescription = "Option 2" }
            )
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Radio Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun RadioButtonCustom() {
    ShowcasePreview {
        var state by remember { mutableStateOf(true) }

        Row(modifier = Modifier.selectableGroup()) {
            RadioButton(
                selected = state,
                onClick = { state = true },
                modifier = Modifier.semantics { contentDescription = "Option 1" },
                enabled = true,
                colors = RadioButtonDefaults.colors(
                    selectedColor = MaterialTheme.colorScheme.primary,
                    unselectedColor = MaterialTheme.colorScheme.secondary,
                    disabledSelectedColor = MaterialTheme.colorScheme.tertiary,
                    disabledUnselectedColor = MaterialTheme.colorScheme.tertiary
                )
            )

            RadioButton(
                selected = !state,
                onClick = { state = false },
                modifier = Modifier.semantics { contentDescription = "Option 2" },
                enabled = true,
                colors = RadioButtonDefaults.colors(
                    selectedColor = MaterialTheme.colorScheme.primary,
                    unselectedColor = MaterialTheme.colorScheme.secondary,
                    disabledSelectedColor = MaterialTheme.colorScheme.tertiary,
                    disabledUnselectedColor = MaterialTheme.colorScheme.tertiary
                )
            )
        }
    }
}