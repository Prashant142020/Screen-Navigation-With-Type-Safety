package com.example.navigationtypesafe

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute


@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Dest.Home) {
        composable<Dest.Home> {
            HomeScreen {
                navController.navigate(Dest.Profile(name = "Prashant", age = 20))
            }
        }
        composable<Dest.Profile> {
            val profile = it.toRoute<Dest.Profile>()
            ProfileScreen(profile) {
                navController.navigate(Dest.Home)


            }
        }
    }
}