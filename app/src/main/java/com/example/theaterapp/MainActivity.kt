package com.example.theaterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.theaterapp.data.DiscoverScreenState
import com.example.theaterapp.ui.theme.ApplicationTheme
import com.example.theaterapp.ui.screen.DiscoverScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DiscoverScreen(
                        modifier = Modifier.padding(innerPadding),
                        screenState = DiscoverScreenState()
                    )
                }
            }
        }
    }
}