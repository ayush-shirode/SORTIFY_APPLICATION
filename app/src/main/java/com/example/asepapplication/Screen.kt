package com.example.asepapplication

sealed class Screen(val route: String) {
    object MainApp: Screen("mainApp")
    object QRpage: Screen("QRpage")
}