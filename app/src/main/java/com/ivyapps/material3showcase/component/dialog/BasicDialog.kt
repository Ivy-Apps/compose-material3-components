package com.ivyapps.material3showcase.component.dialog

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Basic Dialog",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun BasicDialogDefault() {
    ShowcasePreview(1200, 2000, hideDarkMode = true) {
        val openDialog = remember { mutableStateOf(true) }

        if (openDialog.value) {
            AlertDialog(
                onDismissRequest = { openDialog.value = false },
                icon = { Icon(Icons.Filled.Info, contentDescription = "Info") },
                title = {
                    Text(text = "Title")
                },
                text = {
                    Text(
                        "This area typically contains the supportive text " +
                                "which presents the details regarding the Dialog's purpose."
                    )
                },
                confirmButton = {
                    TextButton(
                        onClick = {
                            openDialog.value = false
                        }
                    ) {
                        Text("Confirm")
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = {
                            openDialog.value = false
                        }
                    ) {
                        Text("Dismiss")
                    }
                }
            )
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Basic Dialog",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun BasicDialogCustom() {
    ShowcasePreview(1200, 2000, hideDarkMode = true) {
        val openDialog = remember { mutableStateOf(true) }

        if (openDialog.value) {
            AlertDialog(
                modifier = Modifier,
                onDismissRequest = { openDialog.value = false },
                icon = { Icon(Icons.Filled.Info, contentDescription = "Info") },
                title = {
                    Text(text = "Title")
                },
                text = {
                    Text(
                        "This area typically contains the supportive text " +
                                "which presents the details regarding the Dialog's purpose."
                    )
                },
                confirmButton = {
                    TextButton(
                        onClick = {
                            openDialog.value = false
                        }
                    ) {
                        Text("Confirm")
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = {
                            openDialog.value = false
                        }
                    ) {
                        Text("Dismiss")
                    }
                },
                shape = RoundedCornerShape(12.dp),
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                iconContentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                titleContentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                textContentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                tonalElevation = 1.dp
            )
        }
    }
}