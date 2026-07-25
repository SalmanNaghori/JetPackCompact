package com.example.jetpackcompact

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcompact.second.AssetsAccess
import com.example.jetpackcompact.ui.theme.JetPackCompactTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackCompactTheme {
//                Greeting()
AssetsAccess()
            }
        }
    }
}

