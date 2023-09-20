package dev.kevalkanapriya.myntrahomepage.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.kevalkanapriya.myntrahomepage.navigation.BottomNavBar

@Composable
fun CustomBottomNavigationItem(item: BottomNavBar, isSelected: Boolean, onClick: () -> Unit) {
    val background = if (isSelected) MaterialTheme.colorScheme.primary else Color.Transparent
    val contentColor = if (isSelected) Color.White else MaterialTheme.colorScheme.onBackground

    Column(
        modifier = Modifier
            .padding(bottom = 10.dp, start = 10.dp, end = 10.dp)
            .clickable(onClick = onClick),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier
                .size(40.dp)
                .padding(10.dp)
            ,
            painter = painterResource(id = item.icon),
            contentDescription = null,
        )


        Text(text = item.title, color = Color.Black, fontSize = 10.sp, fontWeight = FontWeight.Bold)
    }

}

