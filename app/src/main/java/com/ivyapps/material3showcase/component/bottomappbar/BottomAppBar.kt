package com.ivyapps.material3showcase.component.bottomappbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

private const val width = 420
private const val height = 80

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "BottomAppBar",
    widthDp = width,
    heightDp = height,
)
@Composable
fun BottomAppBarDemo() {
    ShowcasePreview(width = width, height = height) {
        BottomAppBar(
            actions = {
                IconButton(
                    onClick = {
                        /* doSomething() */
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Search"
                    )
                }
                IconButton(
                    onClick = {
                        /* doSomething() */
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "Star"
                    )
                }
            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {
                        /* Do something! */
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Compose"
                    )
                }
            }
        )
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "BottomAppBar",
    widthDp = width,
    heightDp = height,
)
@Composable
fun BottomAppBarCustomDemo() {
    ShowcasePreview(width = width, height =  height) {

        BottomAppBar(
            modifier = Modifier,
            containerColor = MaterialTheme.colorScheme.tertiary,
            contentColor = MaterialTheme.colorScheme.onTertiary,
            tonalElevation = 8.dp,
            contentPadding = PaddingValues(all = 4.dp),
            windowInsets = WindowInsets.navigationBars,
            actions = {
                IconButton(
                    onClick = {
                        /* doSomething() */
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Search"
                    )
                }
                IconButton(
                    onClick = {
                        /* doSomething() */
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "Star"
                    )
                }
            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {
                        /* Do something! */
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add"
                    )
                }
            }
        )
    }
}