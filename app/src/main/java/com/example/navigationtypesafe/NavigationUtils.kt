package com.example.navigationtypesafe

import kotlinx.serialization.Serializable


sealed class Dest {
    @Serializable
    data object Home : Dest()

    @Serializable
    data object Profile : Dest()
}