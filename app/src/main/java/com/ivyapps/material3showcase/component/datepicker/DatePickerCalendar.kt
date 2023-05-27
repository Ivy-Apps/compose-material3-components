package com.ivyapps.material3showcase.component.datepicker

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "Date Picker (Calendar)",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun DatePickerDefault() {
    ShowcasePreview(1200, 2000, hideDarkMode = true) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            val datePickerState = rememberDatePickerState(initialSelectedDateMillis = 1685112333816)

            DatePicker(
                modifier = Modifier.padding(16.dp),
                state = datePickerState
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "Date Picker (Calendar)",
    widthDp = 1200,
    heightDp = 2000
)
@Composable
fun DatePickerCustom() {
    ShowcasePreview(1200, 2000, hideDarkMode = true) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            val datePickerState = rememberDatePickerState(initialSelectedDateMillis = 1685112333816)

            DatePicker(
                modifier = Modifier.padding(16.dp),
                state = datePickerState,
                colors = DatePickerDefaults.colors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                    headlineContentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                    weekdayContentColor = MaterialTheme.colorScheme.primary,
                    subheadContentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                    yearContentColor = MaterialTheme.colorScheme.tertiary,
                    currentYearContentColor = MaterialTheme.colorScheme.tertiary,
                    selectedYearContentColor = MaterialTheme.colorScheme.primary,
                    selectedYearContainerColor = MaterialTheme.colorScheme.onPrimary,
                    dayContentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                    disabledDayContentColor = MaterialTheme.colorScheme.onTertiary,
                    selectedDayContentColor = MaterialTheme.colorScheme.onPrimary,
                    disabledSelectedDayContentColor = MaterialTheme.colorScheme.onTertiary,
                    selectedDayContainerColor = MaterialTheme.colorScheme.primary,
                    disabledSelectedDayContainerColor = MaterialTheme.colorScheme.tertiary,
                    todayContentColor = MaterialTheme.colorScheme.primary,
                    todayDateBorderColor = MaterialTheme.colorScheme.primary,
                    dayInSelectionRangeContentColor = MaterialTheme.colorScheme.primary,
                    dayInSelectionRangeContainerColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }
    }
}