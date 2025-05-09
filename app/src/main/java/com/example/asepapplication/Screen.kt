package com.example.asepapplication

sealed class Screen(val route: String) {
    object MainApp: Screen("mainApp")
    object QRpage: Screen("QRpage")
    object Mappage: Screen("Mappage")
    object contribution: Screen("contribution")
    object guide: Screen("guide")
}