package com.ivyapps.material3showcase.component.timepicker

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TimeInput
import androidx.compose.material3.TimePickerDefaults
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Time Picker Input",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun TimePickerInputDefault() {
    ShowcasePreview(width = 1200, height = 2000, hideDarkMode = true) {
        var showTimePicker by remember { mutableStateOf(false) }
        val state = rememberTimePickerState()
        val snackState = remember { SnackbarHostState() }

        Column {
            Box(propagateMinConstraints = false) {
                Button(
                    modifier = Modifier.align(Alignment.Center),
                    onClick = { showTimePicker = true }
                ) {
                    Text("Set Time")
                }

                SnackbarHost(hostState = snackState)
            }

            Spacer(modifier = Modifier.height(20.dp))

            if (showTimePicker) {
                TimeInput(state = state)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Time Picker Input",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun TimePickerInputCustom() {
    ShowcasePreview(width = 1200, height = 2000, hideDarkMode = true) {
        var showTimePicker by remember { mutableStateOf(false) }
        val state = rememberTimePickerState()
        val snackState = remember { SnackbarHostState() }

        Column {
            Box(propagateMinConstraints = false) {
                Button(
                    modifier = Modifier.align(Alignment.Center),
                    onClick = { showTimePicker = true }
                ) {
                    Text("Set Time")
                }

                SnackbarHost(hostState = snackState)
            }

            Spacer(modifier = Modifier.height(20.dp))

            if (showTimePicker) {
                TimeInput(
                    modifier = Modifier,
                    state = state,
                    colors = TimePickerDefaults.colors(
                        clockDialColor = MaterialTheme.colorScheme.secondaryContainer,
                        clockDialSelectedContentColor = MaterialTheme.colorScheme.onPrimary,
                        clockDialUnselectedContentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                        selectorColor = MaterialTheme.colorScheme.primary,
                        containerColor = MaterialTheme.colorScheme.secondaryContainer,
                        periodSelectorBorderColor = MaterialTheme.colorScheme.primary,
                        periodSelectorSelectedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                        periodSelectorUnselectedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                        periodSelectorSelectedContentColor = MaterialTheme.colorScheme.primary,
                        periodSelectorUnselectedContentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                        timeSelectorSelectedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                        timeSelectorUnselectedContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                        timeSelectorSelectedContentColor = MaterialTheme.colorScheme.primary,
                        timeSelectorUnselectedContentColor = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                )
            }
        }
    }
}