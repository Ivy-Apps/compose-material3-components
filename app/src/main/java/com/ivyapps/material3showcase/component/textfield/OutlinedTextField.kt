package com.ivyapps.material3showcase.component.textfield

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Outlined Text Field",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun OutlinedTextFieldDefault() {
    ShowcasePreview(width = 1200, height = 2000, hideDarkMode = true) {
        var text by rememberSaveable { mutableStateOf("") }

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Label") }
        )
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Outlined Text Field",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun OutlinedTextFieldCustom() {
    ShowcasePreview(width = 1200, height = 2000, hideDarkMode = true) {
        var text by rememberSaveable { mutableStateOf("") }

        OutlinedTextField(
            modifier = Modifier,
            value = text,
            onValueChange = { text = it },
            label = { Text("Label") },
            enabled = true,
            readOnly = false,
            textStyle = MaterialTheme.typography.bodyMedium,
            placeholder = {
                Text(text = "placeholder")
            },
            supportingText = {
                Text(text = "Supporting text")
            },
            singleLine = true,
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors()
        )
    }
}