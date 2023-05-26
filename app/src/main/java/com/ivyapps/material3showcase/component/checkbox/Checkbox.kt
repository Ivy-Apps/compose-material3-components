package com.ivyapps.material3showcase.component.checkbox

import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview
import com.ivyapps.material3showcase.component.showkaseHeight
import com.ivyapps.material3showcase.component.showkaseWidth

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Checkbox",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun CheckboxDefault() {
    ShowcasePreview {
        val checkedState = remember { mutableStateOf(true) }

        Checkbox(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it }
        )
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Checkbox",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun CheckboxCustom() {
    ShowcasePreview {
        val checkedState = remember { mutableStateOf(true) }

        Checkbox(
            modifier = Modifier,
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it },
            enabled = true,
            colors = CheckboxDefaults.colors(
                checkedColor = MaterialTheme.colorScheme.secondary,
                uncheckedColor = MaterialTheme.colorScheme.secondaryContainer,
                checkmarkColor = MaterialTheme.colorScheme.tertiaryContainer,
                disabledCheckedColor = MaterialTheme.colorScheme.tertiaryContainer,
                disabledUncheckedColor = MaterialTheme.colorScheme.tertiaryContainer,
                disabledIndeterminateColor = MaterialTheme.colorScheme.onTertiaryContainer
            )
        )
    }
}