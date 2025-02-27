package com.example.theaterapp.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SectionHeader(
    modifier: Modifier = Modifier,
    text: String
){
    Text(
        text = text,
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier
    )
}