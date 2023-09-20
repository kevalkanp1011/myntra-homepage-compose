package dev.kevalkanapriya.myntrahomepage.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.kevalkanapriya.myntrahomepage.R


@Preview
@Composable
fun CategoryChooseTab() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        OutlinedButton(
            modifier = Modifier
                .weight(1f)
                .wrapContentHeight(),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color(0xFF1F1D1D)
            ),
            contentPadding = PaddingValues(bottom = 0.dp),
            onClick = {

            }) {
            Image(
                modifier = Modifier.size(35.dp),
                painter = painterResource(id = R.drawable.mensfashionnew),
                contentDescription = "fashion"
            )
            Spacer(modifier = Modifier.width(2.dp))
            Text(text = "Fashion", color = Color.White)
        }
        
        Spacer(modifier = Modifier.width(20.dp))

        OutlinedButton(
            modifier = Modifier
                .weight(1f)
                .wrapContentHeight(),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color(0xffffffff),
                contentColor = Color(0xFF1F1D1D)

            ),
            border = BorderStroke(width = 1.5.dp, color = Color(0xFF1F1D1D)),
            contentPadding = PaddingValues(bottom = 0.dp),
            onClick = {

            }) {

            Image(
                modifier = Modifier.size(35.dp),
                painter = painterResource(id = R.drawable.cosmatic),
                contentDescription = "beauty"
            )
            Spacer(modifier = Modifier.width(2.dp))
            Text(text = "Beauty")
        }

    }

}