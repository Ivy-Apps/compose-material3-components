package com.ivyapps.material3showcase.component.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

private const val width = 420
private const val height = 220

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Outlined Card",
    widthDp = width,
    heightDp = height,
)
@Composable
fun OutlinedCardDefault() {
    ShowcasePreview(width = width, height = height) {
        OutlinedCard {
            Text(
                modifier = Modifier.padding(16.dp),
                text = "Title",
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                modifier = Modifier.padding(16.dp),
                text = "From your recent favorites",
                style = MaterialTheme.typography.bodySmall
            )

            Button(
                modifier = Modifier.padding(16.dp),
                onClick = {
                    /* Do something! */
                }
            ) {
                Text("Buy")
            }
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Outlined Card",
    widthDp = width,
    heightDp = height,
)
@Composable
fun OutlinedCardCustom() {
    ShowcasePreview(width = width, height = height) {
        OutlinedCard(
            modifier = Modifier,
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.outlinedCardColors(
                containerColor = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.onBackground,
                disabledContainerColor = MaterialTheme.colorScheme.background,
                disabledContentColor = MaterialTheme.colorScheme.onBackground
            ),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground)
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "Title",
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                modifier = Modifier.padding(8.dp),
                text = "From your recent favorites",
                style = MaterialTheme.typography.bodySmall
            )

            Button(
                modifier = Modifier.padding(8.dp),
                onClick = {
                    /* Do something! */
                }
            ) {
                Text("Buy")
            }
        }
    }
}