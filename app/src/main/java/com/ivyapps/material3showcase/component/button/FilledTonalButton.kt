package com.ivyapps.material3showcase.component.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview
import com.ivyapps.material3showcase.component.showkaseHeight
import com.ivyapps.material3showcase.component.showkaseWidth

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Filled Tonal Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun FilledTonalButtonDefault() {
    ShowcasePreview {
        FilledTonalButton(
            onClick = {
                /* Do something! */
            }
        ) {
            Text("Text")
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Filled Tonal Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun FilledTonalButtonCustom() {
    ShowcasePreview {
        FilledTonalButton(
            onClick = {
                /* Do something! */
            },
            modifier = Modifier,
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.filledTonalButtonColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                disabledContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
                disabledContentColor = MaterialTheme.colorScheme.onTertiaryContainer
            ),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text("Text")
        }
    }
}