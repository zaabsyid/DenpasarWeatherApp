package com.zahirar.denpasarweatherapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zahirar.denpasarweatherapp.R
import com.zahirar.denpasarweatherapp.adapter.WeatherItemAdapter
import com.zahirar.denpasarweatherapp.databinding.ActivityMainBinding
import com.zahirar.denpasarweatherapp.model.WeatherDataClass

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listWeather = arrayListOf(
            WeatherDataClass(2015, "Scattered Clouds", "27 - 27.4\u2103", "1008hpa", "83%", "46km/h", "1 Januari 2015 00:00", R.drawable.ic_scattered_clouds),
            WeatherDataClass(2015, "Scattered Clouds", "27 - 28\u2103", "1008hpa", "83%", "43km/h", "1 Januari 2015 01:00", R.drawable.ic_scattered_clouds),
            WeatherDataClass(2015, "Few Clouds", "29 - 29.2\u2103", "1008hpa", "74%", "45km/h", "1 Januari 2015 02:00", R.drawable.ic_few_clouds),
            WeatherDataClass(2015, "Broken Clouds", "29 - 30\u2103", "1008hpa", "74%", "46km/h", "1 Januari 2015 03:00", R.drawable.ic_broken_clouds),
            WeatherDataClass(2015, "Scattered Clouds", "26 - 28\u2103", "1007hpa", "74%", "42km/h", "1 Januari 2015 04:00", R.drawable.ic_scattered_clouds),
            WeatherDataClass(2015, "Moderate Rain", "25 - 27.4\u2103", "1006hpa", "73%", "43km/h", "1 Januari 2015 05:00", R.drawable.ic_moderate_rain),
        )

        var adapterWeather = WeatherItemAdapter(listWeather)
        var linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvListWeather.layoutManager = linearLayout
        binding.rvListWeather.adapter = adapterWeather

        adapterWeather.onClick = { selectedWeatherData ->
            binding.tvCloud.text = selectedWeatherData.nameCloud
            binding.tvTemp.text = selectedWeatherData.temp
            binding.tvPressure.text = selectedWeatherData.pressure
            binding.tvHumidity.text = selectedWeatherData.humidity
            binding.tvWind.text = selectedWeatherData.wind
            binding.tvDatetime.text = selectedWeatherData.datetime
            binding.ivWeather.setImageResource(selectedWeatherData.image)
        }
    }
}