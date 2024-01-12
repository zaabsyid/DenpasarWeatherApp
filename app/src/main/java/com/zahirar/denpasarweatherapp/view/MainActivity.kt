package com.zahirar.denpasarweatherapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zahirar.denpasarweatherapp.R
import com.zahirar.denpasarweatherapp.adapter.WeatherItemAdapter
import com.zahirar.denpasarweatherapp.data.WeatherData
import com.zahirar.denpasarweatherapp.databinding.ActivityMainBinding
import com.zahirar.denpasarweatherapp.model.WeatherDataClass

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapterWeather = WeatherItemAdapter(WeatherData.listWeather)
        var linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvListWeather.layoutManager = linearLayout
        binding.rvListWeather.adapter = adapterWeather

        adapterWeather.onClick = { selectedWeatherData ->
            binding.tvCloud.text = selectedWeatherData.weatherdesc
            binding.tvTemp.text = selectedWeatherData.temp
            binding.tvPressure.text = selectedWeatherData.pressure
            binding.tvHumidity.text = selectedWeatherData.humidity
            binding.tvWind.text = selectedWeatherData.wind
            binding.tvDatetime.text = selectedWeatherData.datetime
            binding.ivWeather.setImageResource(selectedWeatherData.image)
        }
    }
}