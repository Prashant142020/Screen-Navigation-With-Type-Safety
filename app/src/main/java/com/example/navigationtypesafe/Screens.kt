package com.example.navigationtypesafe

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun HomeScreen(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Welcome to home screen", modifier = Modifier.clickable { onClick.invoke() })

    }

}


@Composable
fun ProfileScreen(profile: Dest.Profile, onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "Welcome to Profile screen ${profile.name} ${profile.age}",
            modifier = Modifier.clickable { onClick.invoke() })

    }

}


