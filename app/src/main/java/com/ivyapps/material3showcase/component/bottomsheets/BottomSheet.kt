package com.ivyapps.material3showcase.component.bottomsheets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable
import com.ivyapps.material3showcase.component.ComponentPreview
import com.ivyapps.material3showcase.component.ShowcasePreview

private const val width = 420
private const val height = 180

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Default",
    group = "BottomSheet",
    widthDp = width,
    heightDp = height,
)
@Composable
fun BottomSheetDemo() {
    ShowcasePreview(width = width, height = height) {
        val scaffoldState = rememberBottomSheetScaffoldState()
        /* Use this to control the BottomSheet's visibility
        for example in Button(onClick = {}) or LaunchedEffect{}
        val scope = rememberCoroutineScope()
        scope.launch {
            scaffoldState.bottomSheetState.show()
            scaffoldState.bottomSheetState.hide()
            scaffoldState.bottomSheetState.expand()
            scaffoldState.bottomSheetState.partialExpand()
        }
         */

        BottomSheetScaffold(
            scaffoldState = scaffoldState,
            sheetPeekHeight = 120.dp, // BottomSheet's height when it's collapsed
            sheetShadowElevation = 12.dp,
            sheetContent = {
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Sheet content"
                )
            }) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(modifier = Modifier.height(8.dp))
                Text("Screen content")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@ComponentPreview
@ShowkaseComposable(
    name = "Custom",
    group = "BottomSheet",
    widthDp = width,
    heightDp = height,
)
@Composable
fun BottomSheetCustomDemo() {
    ShowcasePreview(width = width, height = height) {
        val scaffoldState = rememberBottomSheetScaffoldState()
        /* Use this to control the BottomSheet's visibility
        for example in Button(onClick = {}) or LaunchedEffect{}
        val scope = rememberCoroutineScope()
        scope.launch {
            scaffoldState.bottomSheetState.show()
            scaffoldState.bottomSheetState.hide()
            scaffoldState.bottomSheetState.expand()
            scaffoldState.bottomSheetState.partialExpand()
        }
         */

        BottomSheetScaffold(
            modifier = Modifier,
            scaffoldState = scaffoldState,
            sheetPeekHeight = 80.dp, // BottomSheet's height when it's collapsed
            sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
            sheetContainerColor = MaterialTheme.colorScheme.secondaryContainer,
            sheetContentColor = MaterialTheme.colorScheme.onSecondaryContainer,
            sheetShadowElevation = 4.dp,
            sheetDragHandle = null,
            sheetSwipeEnabled = true,
            topBar = {
                Surface(
                    color = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary,
                    shadowElevation = 8.dp
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Text(text = "Topbar")
                    }
                }
            },
            sheetContent = {
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Sheet content"
                )
            }) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(modifier = Modifier.height(32.dp))
                Text("Screen content")
            }
        }
    }
}