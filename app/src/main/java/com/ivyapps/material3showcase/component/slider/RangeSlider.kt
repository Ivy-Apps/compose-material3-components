package com.ivyapps.material3showcase.component.slider

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Range Slider",
    widthDp = 2000,
    heightDp = 2000
)
@Composable
fun RangeSliderDefault() {
    ShowcasePreview(2000, 2000, hideDarkMode = true) {
        var sliderPosition by remember { mutableStateOf(0f..100f) }

        Column {
            Text(text = sliderPosition.toString())

            RangeSlider(
                modifier = Modifier.semantics { contentDescription = "" },
                steps = 5,
                value = sliderPosition,
                onValueChange = { sliderPosition = it },
                valueRange = 0f..100f,
                onValueChangeFinished = {}
            )
        }
    }
}

@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Range Slider",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun RangeSliderCustom() {
    ShowcasePreview(1200, 2000, hideDarkMode = true) {
        var sliderPosition by remember { mutableStateOf(0f..100f) }

        Column {
            Text(text = sliderPosition.toString())

            RangeSlider(
                modifier = Modifier.semantics { contentDescription = "" },
                steps = 5,
                value = sliderPosition,
                onValueChange = { sliderPosition = it },
                valueRange = 0f..100f,
                onValueChangeFinished = {},
                enabled = true,
                colors = SliderDefaults.colors(
                    thumbColor = MaterialTheme.colorScheme.primary,
                    activeTrackColor = MaterialTheme.colorScheme.primary,
                    activeTickColor = MaterialTheme.colorScheme.primary,
                    inactiveTrackColor = MaterialTheme.colorScheme.secondary,
                    inactiveTickColor = MaterialTheme.colorScheme.secondary,
                    disabledThumbColor = MaterialTheme.colorScheme.secondary,
                    disabledActiveTrackColor = MaterialTheme.colorScheme.secondary,
                    disabledActiveTickColor = MaterialTheme.colorScheme.secondary,
                    disabledInactiveTrackColor = MaterialTheme.colorScheme.secondary,
                    disabledInactiveTickColor = MaterialTheme.colorScheme.secondary
                )
            )
        }
    }
}