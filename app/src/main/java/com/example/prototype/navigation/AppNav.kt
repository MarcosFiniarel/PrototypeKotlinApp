package com.example.prototype.navigation

import androidx.compose.animation.core.StartOffset
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.prototype.ui.home.MuestraDatosScreen
import com.example.prototype.ui.theme.HomeScreen

@Composable
fun AppNav(){

    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = "login"
    ){
        composable(route = "login"){
            HomeScreen(navController)
        }
        composable(
            route = "muestraDatos/{username}",
                arguments = listOf(
                    navArgument(name = "username"){
                        type = NavType.StringType
                    }
                )
        ){
            backStackEntry ->
            val username = backStackEntry.arguments?.getString("username").orEmpty()
            MuestraDatosScreen(username = username, navController = navController)
        }
    }
}