package com.ivyapps.material3showcase.component.textfield

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Filled Text Field",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun FilledTextFieldDefault() {
    ShowcasePreview(width = 1200, height = 2000, hideDarkMode = true) {
        var text by rememberSaveable(stateSaver = TextFieldValue.Saver) {
            mutableStateOf(TextFieldValue("", TextRange(0, 7)))
        }

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Label") }
        )
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Filled Text Field",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun FilledTextFieldCustom() {
    ShowcasePreview(width = 1200, height = 2000, hideDarkMode = true) {
        var text by rememberSaveable(stateSaver = TextFieldValue.Saver) {
            mutableStateOf(TextFieldValue("", TextRange(0, 7)))
        }

        TextField(
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
            singleLine = true,
            shape = RoundedCornerShape(12.dp),
            colors = TextFieldDefaults.colors()
        )
    }
}