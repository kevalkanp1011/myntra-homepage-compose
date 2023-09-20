package dev.kevalkanapriya.myntrahomepage.navigation

sealed class Screen(val route: String) {

    object Home: Screen("home")

    object FWD: Screen("hot_trends")

    object Everyday: Screen("everyday")

    object Luxe: Screen("luxe")

    object Profile: Screen("profile")
}
