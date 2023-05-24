package com.ivyapps.material3showcase.component.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview
import com.ivyapps.material3showcase.component.showkaseHeight
import com.ivyapps.material3showcase.component.showkaseWidth

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Elevated Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun ElevatedButtonDefault() {
    ShowcasePreview {
        ElevatedButton(
            onClick = {
                /*TODO: Handle click*/
            }
        ) {
            Text(text = "Text")
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Elevated Button",
    widthDp = showkaseWidth,
    heightDp = showkaseHeight,
)
@Composable
fun ElevatedButtonCustom() {
    ShowcasePreview {
        ElevatedButton(
            onClick = {
                /*TODO: Handle click*/
            },
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.elevatedButtonColors(),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        ) {
            Text(text = "Text")
        }
    }
}