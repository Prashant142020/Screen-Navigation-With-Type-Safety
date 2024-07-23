package com.example.navigationtypesafe

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Dest.Home) {
        composable<Dest.Home> {
            Home {
                navController.navigate(Dest.Profile)

            }
        }

        composable<Dest.Profile> {
            Profile {

                navController.navigate(Dest.Home)
            }
        }
    }
}