package com.ivyapps.material3showcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.models.Showkase
import com.ivyapps.material3showcase.component.animations.AnimationsContent
import com.ivyapps.material3showcase.ui.theme.Material3ShowcaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Material3ShowcaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                            .padding(horizontal = 16.dp),
                        verticalArrangement = Arrangement.Top,
                    ) {
                        Button(
                            onClick = {
                                startActivity(Showkase.getBrowserIntent(this@MainActivity))
                            }
                        ) {
                            Text(text = "Showkase")
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        var showAnimations by remember { mutableStateOf(false) }
                        Button(
                            onClick = {
                                showAnimations = true
                            }
                        ) {
                            Text(text = "Animations")
                        }
                        if (showAnimations) {
                            AnimationsContent()
                        }
                    }
                }
            }
        }
        startActivity(Showkase.getBrowserIntent(this@MainActivity))
    }
}