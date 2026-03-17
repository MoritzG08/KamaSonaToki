package com.example.kamasonatoki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.kamasonatoki.ui.GridScreen
import com.example.kamasonatoki.ui.theme.KamaSonaTokiTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KamaSonaTokiTheme {
                GridScreen()
            }
        }
    }
}