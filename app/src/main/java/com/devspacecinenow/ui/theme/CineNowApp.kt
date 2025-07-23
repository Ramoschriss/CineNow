package com.devspacecinenow.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.devspacecinenow.MovieListScreen

@Composable
fun CineNowApp(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "movieList") {
        composable(route = "movieList") {
            MovieListScreen(navController)
        }
        composable(route = "movieDetail"){
            MovieDetailScreen()
        }
    }

}