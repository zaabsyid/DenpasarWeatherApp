package com.zahirar.denpasarweatherapp.model

import java.io.Serializable

data class WeatherDataClass(
    val datetime: String,
    val years: String,
    val temp: String,
    val pressure: String,
    val humidity: String,
    val wind: String,
    val weatherdesc: String,
    val image: Int
) : Serializable
