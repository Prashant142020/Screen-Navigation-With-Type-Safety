package com.example.navigationtypesafe

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController


@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SubGraph.Auth) {
        navigation<SubGraph.Auth>(startDestination = Dest.AuthFirstScreen) {
            composable<Dest.AuthFirstScreen> {
                AuthFirst {

                    navController.navigate(Dest.AuthSecondScreen)

                }
            }
            composable<Dest.AuthSecondScreen> {
                AuthSecond {
                    navController.navigate(Dest.DashSecondScreen)
                }
            }
        }
        navigation<SubGraph.Deshboard>(startDestination = Dest.DashFirstScreen) {
            composable<Dest.DashFirstScreen> {

                DashFirst {

                }
            }
            composable<Dest.DashSecondScreen> {

                DashSecond {

                }
            }
        }
    }
}





