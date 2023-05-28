package com.ivyapps.material3showcase.component.tooltip

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.PlainTooltipBox
import androidx.compose.material3.PlainTooltipState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Plain Tooltip Box",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun PlainTooltipBoxDefault() {
    ShowcasePreview(width = 1200, height = 2000, hideDarkMode = true) {
        val tooltipState = remember { PlainTooltipState() }
        LaunchedEffect(Unit) { tooltipState.show() }

        PlainTooltipBox(
            tooltip = {
                Text("Add to favorites")
            },
            tooltipState = tooltipState
        ) {
            IconButton(
                onClick = {
                    /* Icon button's click event */
                },
                modifier = Modifier.tooltipAnchor()
            ) {
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "Favorite"
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Plain Tooltip Box",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun PlainTooltipBoxCustom() {
    ShowcasePreview(width = 1200, height = 2000, hideDarkMode = true) {
        val tooltipState = remember { PlainTooltipState() }
        LaunchedEffect(Unit) { tooltipState.show() }

        PlainTooltipBox(
            modifier = Modifier,
            tooltip = {
                Text("Add to favorites")
            },
            tooltipState = tooltipState,
            shape = RoundedCornerShape(12.dp),
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            contentColor = MaterialTheme.colorScheme.onSecondaryContainer
        ) {
            IconButton(
                onClick = {
                    /* Icon button's click event */
                },
                modifier = Modifier.tooltipAnchor(),
                enabled = true,
                colors = IconButtonDefaults.filledIconButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary,
                    disabledContainerColor = MaterialTheme.colorScheme.secondary,
                    disabledContentColor = MaterialTheme.colorScheme.onSecondary
                )
            ) {
                Icon(
                    modifier = Modifier,
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "Favorite",
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }
        }
    }
}