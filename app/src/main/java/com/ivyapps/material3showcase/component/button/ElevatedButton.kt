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

@ComponentPreview
@ShowkaseComposable(name = "Default", group = "Elevated Button")
@Composable
fun ElevatedButtonDefault() {
    ShowcasePreview {
        ElevatedButton(
            onClick = {
                /*TODO*/
            }
        ) {
            Text(text = "Text")
        }
    }
}

@ComponentPreview
@ShowkaseComposable(name = "Custom", group = "Elevated Button")
@Composable
fun ElevatedButtonCustom() {
    ShowcasePreview {
        ElevatedButton(
            onClick = {
                /*TODO*/
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