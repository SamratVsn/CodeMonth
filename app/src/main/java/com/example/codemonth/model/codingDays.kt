package com.example.codemonth.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CodingDays(
    val dayCount: Int,
    @StringRes val topicRes: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val descriptionRes: Int,
)