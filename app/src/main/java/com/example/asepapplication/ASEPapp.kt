package com.example.asepapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ASEPapp(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        NavHost(navController = navController, startDestination = Screen.MainApp.route) {
            composable(route = Screen.MainApp.route) {
                mainApp {
                    navController.navigate("QRpage")
                }
            }
            composable(route = Screen.QRpage.route) {
                QRpage {
                    navController.navigate(("mainApp"))
                }
            }
            composable(route = Screen.Mappage.route) {
                MAPpage {
                    navController.navigate("Mapapp")
                }
            }
            composable(route = Screen.contribution.route) {
                contribution {
                    navController.navigate("contribution")
                }
            }
            composable(route = Screen.guide.route) {
                guide {
                    navController.navigate("guide")
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(Color(0xFF63FFB6))
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = {navController.navigate(Screen.MainApp.route)}) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile"
                    )
                }
                IconButton(onClick = {navController.navigate(Screen.Mappage.route)}) {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "Map"
                    )
                }
                IconButton(onClick = {navController.navigate(Screen.QRpage.route) }) {
                    Image(
                        painter = painterResource(id = R.drawable.sortifylogo),
                        contentDescription = "Sortify",
                        modifier = Modifier.size(96.dp)
                    )}
                IconButton(onClick = {navController.navigate(Screen.contribution.route) }) {
                    Icon(
                        imageVector = Icons.Default.Done,
                        contentDescription = "Contribution"
                    )
                }
                IconButton(onClick = {navController.navigate(Screen.guide.route) }) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "Guide"
                    )
                }
            }
        }
    }
}