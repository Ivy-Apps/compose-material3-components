package com.ivyapps.material3showcase.component.checkbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Tri State Checkbox",
    widthDp = 120,
    heightDp = 220,
)
@Composable
fun TriStateCheckboxDefault() {
    ShowcasePreview(120, 220) {
        TriStateCheckbox(
            state = ToggleableState.On,
            onClick = {
                /* Do something! */
            }
        )
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Tri State Checkbox",
    widthDp = 120,
    heightDp = 220,
)
@Composable
fun TriStateCheckboxCustom() {
    ShowcasePreview(120, 220) {
        Column {
            // define dependent checkboxes states
            val (state, onStateChange) = remember { mutableStateOf(true) }
            val (state2, onStateChange2) = remember { mutableStateOf(true) }

            // TriStateCheckbox state reflects state of dependent checkboxes
            val parentState = remember(state, state2) {
                if (state && state2) ToggleableState.On
                else if (!state && !state2) ToggleableState.Off
                else ToggleableState.Indeterminate
            }
            // click on TriStateCheckbox can set state for dependent checkboxes
            val onParentClick = {
                val s = parentState != ToggleableState.On
                onStateChange(s)
                onStateChange2(s)
            }

            /*
             The sample below composes just basic checkboxes which are not fully accessible on
             their own. See the CheckboxWithTextSample as a way to ensure your checkboxes are
             fully accessible.
             */
            TriStateCheckbox(
                modifier = Modifier,
                state = parentState,
                onClick = onParentClick,
                enabled = true,
                colors = CheckboxDefaults.colors(
                    checkedColor = MaterialTheme.colorScheme.secondary,
                    uncheckedColor = MaterialTheme.colorScheme.secondaryContainer,
                    checkmarkColor = MaterialTheme.colorScheme.tertiaryContainer,
                    disabledCheckedColor = MaterialTheme.colorScheme.secondary,
                    disabledUncheckedColor = MaterialTheme.colorScheme.secondaryContainer,
                    disabledIndeterminateColor = MaterialTheme.colorScheme.onTertiaryContainer
                )
            )

            Spacer(Modifier.size(25.dp))

            Column(Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp)) {
                Checkbox(state, onStateChange)
                Spacer(Modifier.size(25.dp))
                Checkbox(state2, onStateChange2)
            }
        }
    }
}