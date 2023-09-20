package dev.kevalkanapriya.myntrahomepage.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.kevalkanapriya.myntrahomepage.navigation.BottomNavBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StandardScaffold(
    navController: NavController,
    modifier: Modifier = Modifier,
    showBottomBar: Boolean = true,
    content: @Composable () -> Unit
) {
    Scaffold(
        bottomBar = {
            if (showBottomBar) {

                val items = BottomNavBar.Items.list

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.background)
                        .padding(vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    items.forEach{ item ->
                        CustomBottomNavigationItem(
                            item = item,
                            isSelected = navController.currentDestination?.route?.startsWith(item.route) == true
                        ) {
                            if (navController.currentDestination?.route != item.route) {
                                navController.navigate(item.route)
                            }
                        }
                    }
                }
            }
        },
        floatingActionButton = {
            OutlinedButton(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.Black, contentColor = Color.White)
            ) {
                Text(text = "Floating Button")
            }

        },
        snackbarHost = {},
        modifier = modifier
    ) { paddingValues ->
        content()
    }
}