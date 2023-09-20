package dev.kevalkanapriya.myntrahomepage.domain.model

import androidx.annotation.DrawableRes

data class SlidingCarousel(
    @DrawableRes val logo: Int,
    val desc: String,
    val offer: Int,
    @DrawableRes val image: Int
)
