package com.bohemian.android_jetpack_boilerplate.compose

import androidx.appcompat.widget.Toolbar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bohemian.android_jetpack_boilerplate.enums.HomeBottomTabEnum


@Composable
fun AppCompose(
    onPageChange: (HomeBottomTabEnum) -> Unit = {},
    onAttached: (Toolbar) -> Unit = {},
) {
    val navController = rememberNavController()
    AppNavHost(navController, onPageChange, onAttached)
}

@Composable
fun AppNavHost(
    navController: NavController,
    onPageChange: (HomeBottomTabEnum) -> Unit = {},
    onAttached: (Toolbar) -> Unit = {},
) {

}
