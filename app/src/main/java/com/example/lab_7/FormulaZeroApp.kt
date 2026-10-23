package com.example.lab_7

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


//FormulaZeroApp.kt will define how we navigate between screens

@Composable
fun FormulaZeroApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("races") { UpcomingRacesScreen(navController) }
        composable("drivers") { DriversScreen(navController) }
    }
}