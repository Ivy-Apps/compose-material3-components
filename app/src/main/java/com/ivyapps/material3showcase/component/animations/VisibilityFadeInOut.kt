package com.ivyapps.material3showcase.component.animations

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.Crossfade
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Anim1() {
    var visible by remember { mutableStateOf(false) }
    AnimatedVisibility(
        modifier = Modifier,
        visible = visible,
        enter = fadeIn() + expandVertically(),
        exit = fadeOut() + shrinkVertically(),
    ) {

    }
}

@Composable
fun Anim2() {
    var currentState by remember { mutableStateOf("a") }
    Crossfade(
        targetState = currentState,
        label = "crossfade content"
    ) { state ->
        when (state) {
            "a" -> {

            }

            else -> {

            }
        }
    }
}

@Composable
fun Anim3() {
    var visible by remember { mutableStateOf(false) }
    val aplha by animateFloatAsState(
        targetValue = if (visible) 1f else 0f,
        label = "alpha anim"
    )
}

@Composable
fun Anim4() {
    var visible by remember { mutableStateOf(false) }
    val offsetTop by animateDpAsState(
        targetValue = if (visible) 0.dp else 48.dp,
        label = "offset anim"
    )
}

@Composable
fun Anim5() {
    var visible by remember { mutableStateOf(false) }
    val color by animateColorAsState(
        targetValue = if (visible) Color.Blue else Color.Red,
        label = "color anim"
    )
}