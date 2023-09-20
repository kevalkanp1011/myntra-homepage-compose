package dev.kevalkanapriya.myntrahomepage.navigation

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector
import dev.kevalkanapriya.myntrahomepage.R

data class BottomNavItem(
    val route: String,
    val icon: ImageVector? = null,
    val contentDescription: String? = null,
)

sealed class BottomNavBar(
    @DrawableRes val icon: Int,
    val title: String,
    val route: String
) {
    object Home : BottomNavBar(
        icon = R.drawable.myntra_logo_cropped,
        title = "Home",
        route = Screen.Home.route
    )
    object FWD : BottomNavBar(
        icon = R.drawable.fwd_logo_myntra,
        title = "Hot Trends",
        route = Screen.FWD.route
    )
    object Everyday : BottomNavBar(
        icon = R.drawable.tshirt,
        title = "Everyday",
        route = Screen.Everyday.route
    )
    object Luxe : BottomNavBar(
        icon = R.drawable.diamond,
        title = "Luxe",
        route = Screen.Luxe.route
    )
    object Profile : BottomNavBar(
        icon = R.drawable.baseline_person_24,
        title = "nitish",
        route = Screen.Profile.route
    )
    object Items {
        val list = listOf(
            Home,
            FWD,
            Everyday,
            Luxe,
            Profile
        )
    }


}

