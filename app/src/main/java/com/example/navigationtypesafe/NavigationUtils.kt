package com.example.navigationtypesafe

import kotlinx.serialization.Serializable


sealed class Dest {
    @Serializable
    data object Home : Dest()

    @Serializable
    data class Profile(val name: String, val age: Int) : Dest()
}