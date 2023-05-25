package com.ivyapps.material3showcase.component.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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

private const val width = 520
private const val height = 170

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
            Column(
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                Text(
                    text = "Title",
                    style = MaterialTheme.typography.headlineMedium
                )

                Text(
                    text = "From your recent ones",
                    style = MaterialTheme.typography.bodySmall
                )

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        /* Do something! */
                    }
                ) {
                    Text("Buy")
                }
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
            Column(
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                Text(
                    text = "Title",
                    style = MaterialTheme.typography.headlineMedium
                )

                Text(
                    text = "From your recent ones",
                    style = MaterialTheme.typography.bodySmall
                )

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        /* Do something! */
                    }
                ) {
                    Text("Buy")
                }
            }
        }
    }
}