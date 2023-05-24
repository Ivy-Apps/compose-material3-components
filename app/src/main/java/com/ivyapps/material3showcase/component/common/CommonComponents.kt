package com.ivyapps.material3showcase.component.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CommonText() {
    Text(
        modifier = Modifier,
        text = "Text",
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Start
    )
}

@Composable
fun CommonColumn() {
    Column(
        modifier = Modifier,
    ) {

    }
}

@Composable
fun CommonRow() {
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {

    }
}

@Composable
fun CommonBox() {
    Box(
        modifier = Modifier,
        contentAlignment = Alignment.Center,
    ) {

    }
}

@Composable
fun CommonVerticalSpacer() {
    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
fun CommonHorizontalSpacer() {
    Spacer(modifier = Modifier.width(8.dp))
}

@Composable
fun RowScope.CommonSpacerWeight() {
    Spacer(modifier = Modifier.weight(1f))
}

@Composable
fun CommonIcon() {
    Icon(
        imageVector = Icons.Default.Add,
        contentDescription = null,
    )
}

@Composable
fun CommonLazyColum() {
    LazyColumn(
        modifier = Modifier,
        contentPadding = PaddingValues(vertical = 8.dp)
    ) {

    }
}

@Composable
fun CommonLazyRow() {
    LazyRow(
        modifier = Modifier,
        contentPadding = PaddingValues(horizontal = 8.dp)
    ) {

    }
}