package dev.kevalkanapriya.myntrahomepage.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.kevalkanapriya.myntrahomepage.R
import dev.kevalkanapriya.myntrahomepage.domain.model.Category

@Preview
@Composable
fun Categories() {
    //list of 9 top categories
    val list = listOf(
        Category(
            name = "MEN",
            foregroundResId = R.drawable.cosmatic,
            backgroundResId = R.drawable.silk_golden
        ),
        Category(
            name = "WOMEN",
            foregroundResId = R.drawable.cosmatic,
            backgroundResId = R.drawable.silk_golden
        ),
        Category(
            name = "KIDS",
            foregroundResId = R.drawable.cosmatic,
            backgroundResId = R.drawable.silk_golden
        ),
        Category(
            name = "FOOTWEAR",
            foregroundResId = R.drawable.cosmatic,
            backgroundResId = R.drawable.silk_golden
        ),
        Category(
            name = "THE RAKHI EDIT",
            foregroundResId = R.drawable.cosmatic,
            backgroundResId = R.drawable.silk_golden
        ),
        Category(
            name = "BEAUTY",
            foregroundResId = R.drawable.cosmatic,
            backgroundResId = R.drawable.silk_golden
        ),
        Category(
            name = "HOME",
            foregroundResId = R.drawable.cosmatic,
            backgroundResId = R.drawable.silk_golden
        ),
        Category(
            name = "ACCESSORIES",
            foregroundResId = R.drawable.cosmatic,
            backgroundResId = R.drawable.silk_golden
        ),
        Category(
            name = "GADGETS",
            foregroundResId = R.drawable.cosmatic,
            backgroundResId = R.drawable.silk_golden
        )

    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(5), // 3 items per row
        contentPadding = PaddingValues(horizontal = 10.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp),
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        item {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.Red),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(text = "&\nMORE", fontSize = 12.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, color = Color.White)
                    }

                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "TOP OFFERS",
                    fontSize = 8.sp,
                    fontWeight = FontWeight.Bold,
                )


            }



        }
        items(list.size) { index ->
            CategoryCard(list[index])
        }
    }
}

@Composable
fun CategoryCard(item: Category) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Card(
            colors = CardDefaults.cardColors(containerColor = Color.Black.copy(alpha = 0.3f )),
            shape = RoundedCornerShape(15.dp)
        ) {

            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {


                Image(
                    painter = painterResource(id = item.foregroundResId),
                    contentDescription = "foreground",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(60.dp)
                )



            }


        }

        Spacer(modifier = Modifier.height(5.dp))
        if (item.name.length > 8) {
            Text(text = "${item.name}", fontSize = 6.sp, fontWeight = FontWeight.Bold)
        } else {
            Text(text = "${item.name}", fontSize = 8.sp, fontWeight = FontWeight.Bold)
        }

    }





}

