package com.ivyapps.material3showcase.component.badges

import androidx.compose.material3.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Badge",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun BadgeDemo() {
    ShowcasePreview {
        BadgedBox(
            badge = {
                Badge {
                    Text(text = "New")
                }
            }
        ) {
            Icon(
                imageVector = Icons.Filled.ShoppingCart,
                contentDescription = "Card"
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Badge",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun BadgeCustomDemo() {
    ShowcasePreview {
        BadgedBox(
            modifier = Modifier,
            badge = {
                Badge(
                    modifier = Modifier.offset(x = (-16).dp, y = 8.dp),
                    containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                    contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                ) {
                    Text(
                        modifier = Modifier.padding(all = 4.dp),
                        text = "New"
                    )
                }
            }
        ) {
            Button(
                onClick = {
                    /* Do something! */
                }
            ) {
                Text("Shop")
            }
        }
    }
}