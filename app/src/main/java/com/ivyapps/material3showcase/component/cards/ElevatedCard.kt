package com.ivyapps.material3showcase.component.cards

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
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
    group = "Elevated Card",
    widthDp = width,
    heightDp = height,
)
@Composable
fun ElevatedCardDefault() {
    ShowcasePreview(width = width, height = height) {
        ElevatedCard {
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

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Elevated Card",
    widthDp = width,
    heightDp = height,
)
@Composable
fun ElevatedCardCustom() {
    ShowcasePreview(width = width, height = height) {
        ElevatedCard(
            modifier = Modifier,
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.elevatedCardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                disabledContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
                disabledContentColor = MaterialTheme.colorScheme.onTertiaryContainer
            ),
            elevation = CardDefaults.cardElevation(1.dp)
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