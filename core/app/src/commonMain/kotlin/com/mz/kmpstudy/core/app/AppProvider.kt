package com.mz.kmpstudy.core.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.mz.kmpstudy.core.routing.routes.Routes
import com.mz.kmpstudy.feature.counter.nav.CounterRoute
import com.mz.kmpstudy.feature.home.nav.HomeRoute

class AppProvider {

    @Composable
    fun App() {
        val navController = rememberNavController()
        MaterialTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color.White
            ) {
                NavHost(
                    navController = navController,
                    startDestination = Routes.HOME
                ) {
                    HomeRoute.composable(this, navController)
                    CounterRoute.composable(this, navController)
                }
            }
        }
    }
}