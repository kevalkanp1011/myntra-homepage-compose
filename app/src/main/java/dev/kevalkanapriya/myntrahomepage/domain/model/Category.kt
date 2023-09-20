package dev.kevalkanapriya.myntrahomepage.domain.model

import androidx.annotation.DrawableRes

data class Category(
    val name: String,
    @DrawableRes val foregroundResId: Int,
    @DrawableRes val backgroundResId: Int
)
