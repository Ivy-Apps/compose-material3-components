package com.ivyapps.material3showcase.component.chip

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.SuggestionChipDefaults
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
    group = "Suggestion Chip",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight
)
@Composable
fun SuggestionChipDefault() {
    ShowcasePreview() {
        SuggestionChip(
            onClick = {
                /* Do something! */
            },
            label = {
                Text("Thank you")
            }
        )
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Suggestion Chip",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun SuggestionChipCustom() {
    ShowcasePreview() {
        SuggestionChip(
            modifier = Modifier,
            onClick = {
                /* Do something! */
            },
            label = {
                Text("Thank you")
            },
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = SuggestionChipDefaults.suggestionChipColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                labelColor = MaterialTheme.colorScheme.onSecondaryContainer,
                disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                disabledLabelColor = MaterialTheme.colorScheme.onSecondaryContainer
            )
        )
    }
}