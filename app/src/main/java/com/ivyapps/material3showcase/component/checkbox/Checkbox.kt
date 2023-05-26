package com.ivyapps.material3showcase.component.checkbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview
import com.ivyapps.material3showcase.component.showkaseWidth

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Checkbox",
    widthDp = showkaseWidth,
    heightDp = 100
)
@Composable
fun CheckboxDefault() {
    ShowcasePreview(height = 100) {
        val checkedState = remember { mutableStateOf(true) }

        Column {
            Checkbox(
                checked = !checkedState.value,
                onCheckedChange = { checkedState.value = it }
            )

            Spacer(modifier = Modifier.height(8.dp))

            Checkbox(
                checked = checkedState.value,
                onCheckedChange = { checkedState.value = it }
            )
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Checkbox",
    widthDp = showkaseWidth,
    heightDp = 100
)
@Composable
fun CheckboxCustom() {
    ShowcasePreview(height = 100) {
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