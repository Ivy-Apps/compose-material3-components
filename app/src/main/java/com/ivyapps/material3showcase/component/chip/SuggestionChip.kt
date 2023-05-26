package com.ivyapps.material3showcase.component.chip

import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
            onClick = {
                /* Do something! */
            },
            label = {
                Text("Thank you")
            }
        )
    }
}