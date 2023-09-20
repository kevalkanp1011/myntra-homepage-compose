package dev.kevalkanapriya.myntrahomepage.presentation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.kevalkanapriya.myntrahomepage.R
import dev.kevalkanapriya.myntrahomepage.domain.model.SlidingCarousel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {

    val scroll = rememberScrollState(50)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .scrollable(scroll, orientation = Orientation.Vertical)

    ) {

        Spacer(modifier = Modifier.height(10.dp))
        TopBar()
        Spacer(modifier = Modifier.height(15.dp))
        SearchBar()
        Spacer(modifier = Modifier.height(15.dp))
        CategoryChooseTab()
        Spacer(modifier = Modifier.height(15.dp))
        Categories()
        Spacer(modifier = Modifier.height(15.dp))
        AutoSlidingCarousel(
            itemsCount = images.size,
            itemContent = { index ->

                Box {
                    Image(
                        modifier = Modifier.height(200.dp),
                        painter = painterResource(id = images[index].image),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                        )


                    Box(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .padding(start = 20.dp, top = 20.dp),
                        //modfier = Modifier.padding(start = 20.dp, top = 20.dp),
                        contentAlignment = Alignment.TopCenter
                    ) {


                        Column(

                        ) {
                            Image(
                                modifier = Modifier.size(40.dp),
                                painter = painterResource(id = R.drawable.myntra_logo_cropped),
                                contentDescription = "logo"
                            )

                            Card(
                                colors = CardDefaults.cardColors(containerColor = Color.Black.copy(alpha = 0.6f))
                            ) {
                                Text(
                                    modifier = Modifier.padding(horizontal = 10.dp),
                                    text = "${images[index].desc}",
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    modifier = Modifier.padding(horizontal = 10.dp),
                                    text = "FLAT ${images[index].offer}% OFF",
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                        }

                    }



                }


            }
        )


    }
}

val images = listOf(
    SlidingCarousel(
        desc = "Kurta Sets",
        offer = 40,
        logo = R.drawable.myntra_logo_cropped,
        image = R.drawable.ima4
    ),
    SlidingCarousel(
        desc = "Payjama Sets",
        offer = 60,
        logo = R.drawable.myntra_logo_cropped,
        image = R.drawable.ima5
    ),
    SlidingCarousel(
        desc = "Jeans Sets",
        offer = 20,
        logo = R.drawable.myntra_logo_cropped,
        image = R.drawable.ima1
    ),
    SlidingCarousel(
        desc = "Shirt Sets",
        offer = 80,
        logo = R.drawable.myntra_logo_cropped,
        image = R.drawable.ima2
    ),
    SlidingCarousel(
        desc = "Headphone Sets",
        offer = 69,
        logo = R.drawable.myntra_logo_cropped,
        image = R.drawable.ima3
    ),
    SlidingCarousel(
        desc = "Earbird Sets",
        offer = 60,
        logo = R.drawable.myntra_logo_cropped,
        image = R.drawable.ima4
    )

)