package com.ivyapps.material3showcase.component.snackbar

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
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
                                message = "Snackbar # ${++clickCount}",
                                duration = SnackbarDuration.Long
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