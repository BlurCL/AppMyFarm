package com.example.farmacia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.farmacia.ui.screens.FarmaciaApp
import com.example.farmacia.ui.theme.FarmaciaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FarmaciaTheme {
                FarmaciaApp()
            }
        }
    }
}
