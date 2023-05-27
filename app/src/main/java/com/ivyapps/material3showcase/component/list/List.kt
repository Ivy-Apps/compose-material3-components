package com.ivyapps.material3showcase.component.list

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "List",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun BasicDialogDefault() {
    ShowcasePreview(1200, 2000, hideDarkMode = true) {
        Column {
            ListItem(
                headlineContent = { Text("One line list item with 24x24 icon") },
                leadingContent = {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = "Info"
                    )
                }
            )

            ListItem(
                headlineContent = { Text("One line list item with 24x24 icon") },
                leadingContent = {
                    Icon(
                        imageVector = Icons.Filled.AccountCircle,
                        contentDescription = "Account"
                    )
                }
            )

            Divider()
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "List",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun BasicDialogCustom() {
    ShowcasePreview(1200, 2000, hideDarkMode = true) {
        Column {
            ListItem(
                modifier = Modifier,
                headlineContent = { Text("One line list item with 24x24 icon") },
                leadingContent = {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = "Info"
                    )
                },
                colors = ListItemDefaults.colors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                    headlineColor = MaterialTheme.colorScheme.onSecondaryContainer,
                    leadingIconColor = MaterialTheme.colorScheme.onSecondaryContainer,
                    overlineColor = MaterialTheme.colorScheme.onSecondaryContainer,
                    supportingColor = MaterialTheme.colorScheme.onTertiary,
                    disabledHeadlineColor = MaterialTheme.colorScheme.onTertiaryContainer,
                    disabledLeadingIconColor = MaterialTheme.colorScheme.onTertiary
                ),
                tonalElevation = 4.dp,
                shadowElevation = 4.dp
            )

            ListItem(
                modifier = Modifier,
                headlineContent = { Text("One line list item with 24x24 icon") },
                leadingContent = {
                    Icon(
                        imageVector = Icons.Filled.AccountCircle,
                        contentDescription = "Account"
                    )
                },
                colors = ListItemDefaults.colors(
                    containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                    headlineColor = MaterialTheme.colorScheme.onTertiaryContainer,
                    leadingIconColor = MaterialTheme.colorScheme.onTertiaryContainer,
                    overlineColor = MaterialTheme.colorScheme.onTertiaryContainer,
                    supportingColor = MaterialTheme.colorScheme.onTertiary,
                    disabledHeadlineColor = MaterialTheme.colorScheme.onTertiaryContainer,
                    disabledLeadingIconColor = MaterialTheme.colorScheme.onTertiary
                ),
                tonalElevation = 4.dp,
                shadowElevation = 4.dp
            )

            Divider()
        }
    }
}