package com.ivyapps.material3showcase.component.snackbar

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarVisuals
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview
import kotlinx.coroutines.launch

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Snackbar",
    widthDp = 2000,
    heightDp = 2000
)
@Composable
fun SnackbarDefault() {
    ShowcasePreview(2000, 2000, hideDarkMode = true) {
        val snackbarHostState = remember { SnackbarHostState() }
        val scope = rememberCoroutineScope()

        Scaffold(
            snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
            floatingActionButton = {
                var clickCount by remember { mutableStateOf(0) }

                ExtendedFloatingActionButton(
                    onClick = {
                        scope.launch {
                            snackbarHostState.showSnackbar(
                                message = "Snackbar # ${++clickCount}"
                            )
                        }
                    }
                ) {
                    Text("Show snackbar")
                }
            },
            content = { innerPadding ->
                Text(
                    text = "Body content",
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                        .wrapContentSize()
                )
            }
        )
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Snackbar",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun SnackbarCustom() {
    ShowcasePreview(1200, 2000, hideDarkMode = true) {
        class SnackbarVisualsWithError(
            override val message: String,
            val isError: Boolean
        ) : SnackbarVisuals {
            override val actionLabel: String
                get() = if (isError) "Error" else "OK"
            override val withDismissAction: Boolean
                get() = false
            override val duration: SnackbarDuration
                get() = SnackbarDuration.Indefinite
        }

        val snackbarHostState = remember { SnackbarHostState() }
        val scope = rememberCoroutineScope()
        Scaffold(
            snackbarHost = {
                // reuse default SnackbarHost to have default animation and timing handling
                SnackbarHost(snackbarHostState) { data ->
                    // custom snackbar with the custom action button color and border
                    val isError = (data.visuals as? SnackbarVisualsWithError)?.isError ?: false
                    val buttonColor = if (isError) {
                        ButtonDefaults.textButtonColors(
                            containerColor = MaterialTheme.colorScheme.errorContainer,
                            contentColor = MaterialTheme.colorScheme.error
                        )
                    } else {
                        ButtonDefaults.textButtonColors(
                            contentColor = MaterialTheme.colorScheme.inversePrimary
                        )
                    }

                    Snackbar(
                        modifier = Modifier
                            .border(2.dp, MaterialTheme.colorScheme.secondary)
                            .padding(12.dp),
                        action = {
                            TextButton(
                                onClick = { if (isError) data.dismiss() else data.performAction() },
                                colors = buttonColor
                            ) {
                                Text(data.visuals.actionLabel ?: "")
                            }
                        },
                        shape = RoundedCornerShape(12.dp),
                        containerColor = MaterialTheme.colorScheme.secondaryContainer,
                        contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                        actionContentColor = MaterialTheme.colorScheme.primary
                    ) {
                        Text(data.visuals.message)
                    }
                }
            },
            floatingActionButton = {
                var clickCount by remember { mutableStateOf(0) }
                ExtendedFloatingActionButton(
                    onClick = {
                        scope.launch {
                            snackbarHostState.showSnackbar(
                                SnackbarVisualsWithError(
                                    "Snackbar # ${++clickCount}",
                                    isError = clickCount % 2 != 0
                                )
                            )
                        }
                    }
                ) { Text("Show snackbar") }
            },
            content = { innerPadding ->
                Text(
                    text = "Custom Snackbar Demo",
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                        .wrapContentSize()
                )
            }
        )
    }
}