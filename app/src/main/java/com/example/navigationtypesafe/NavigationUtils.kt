package com.example.navigationtypesafe

import kotlinx.serialization.Serializable


sealed class SubGraph {
    @Serializable
    data object Auth : SubGraph()

    @Serializable
    data object Deshboard : SubGraph()
}


sealed class Dest {
    @Serializable
    data object AuthFirstScreen : Dest()

    @Serializable
    data object AuthSecondScreen : Dest()

    @Serializable
    data object DashFirstScreen : Dest()

    @Serializable
    data object DashSecondScreen : Dest()

}