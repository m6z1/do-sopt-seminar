package com.m6z1.week1

import androidx.annotation.DrawableRes

data class FriendItemModel(
    @DrawableRes val image: Int,
    val name: String,
    val self_description: String,
)

