package com.example.navigationtypesafe

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun Home(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Welcome to home screen", modifier = Modifier.clickable { onClick.invoke() })

    }

}


@Composable
fun Profile(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Welcome to Profile screen", modifier = Modifier.clickable { onClick.invoke() })

    }

}


