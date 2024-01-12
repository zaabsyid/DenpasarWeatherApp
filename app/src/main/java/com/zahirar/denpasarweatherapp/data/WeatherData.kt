package com.zahirar.denpasarweatherapp.data

import com.zahirar.denpasarweatherapp.R
import com.zahirar.denpasarweatherapp.model.WeatherDataClass

object WeatherData {
    val listWeather = arrayListOf(
        WeatherDataClass("1 Januari 2015 00:00", "2015", "27 - 27.4\u2103", "1008hpa", "83%", "46km/h", "Scattered Clouds", R.drawable.ic_scattered_clouds),
        WeatherDataClass("1 Januari 2015 01:00", "2015", "27 - 28\u2103", "1008hpa", "83%", "43km/h", "Scattered Clouds", R.drawable.ic_scattered_clouds),
        WeatherDataClass("1 Januari 2015 02:00", "2015", "29 - 29.2\u2103", "1008hpa", "74%", "45km/h", "Few Clouds", R.drawable.ic_few_clouds),
        WeatherDataClass("1 Januari 2015 03:00", "2015", "29 - 30\u2103", "1008hpa", "74%", "44km/h", "Broken Clouds", R.drawable.ic_broken_clouds),
        WeatherDataClass("1 Januari 2015 04:00", "2015", "26 - 28\u2103", "1007hpa", "74%", "42km/h", "Scattered Clouds", R.drawable.ic_scattered_clouds),
        WeatherDataClass("1 Januari 2015 05:00", "2015", "25 - 27.4\u2103", "1006hpa", "73%", "43km/h", "Moderate Rain", R.drawable.ic_moderate_rain),
    )
}