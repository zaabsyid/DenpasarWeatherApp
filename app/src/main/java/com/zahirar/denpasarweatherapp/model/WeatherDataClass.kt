package com.zahirar.denpasarweatherapp.model

import java.io.Serializable

data class WeatherDataClass(
    val year: Int,
    val nameCloud: String,
    val temp: String,
    val pressure: String,
    val humidity: String,
    val wind: String,
    val datetime: String,
    val image: Int
) : Serializable
