package com.zahirar.denpasarweatherapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.zahirar.denpasarweatherapp.R
import com.zahirar.denpasarweatherapp.adapter.WeatherItemAdapter
import com.zahirar.denpasarweatherapp.data.WeatherData
import com.zahirar.denpasarweatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val years = listOf("All Years","2015","2016","2017","2018","2019","2020")
        val adapterYears = ArrayAdapter(this, R.layout.item_years, years)
        binding.autoComplete.setAdapter(adapterYears)

        var adapterWeather = WeatherItemAdapter(WeatherData.listWeather)

        binding.autoComplete.onItemClickListener = AdapterView.OnItemClickListener {
                adapterView, view, i, l ->
            val itemSelected = adapterView.getItemAtPosition(i)
            if (itemSelected == "2015") {
                Toast.makeText(this, "Years: $itemSelected", Toast.LENGTH_SHORT).show()
                val weatherData = WeatherData.listWeather.filter { it.years == "2015" }
                adapterWeather = WeatherItemAdapter(weatherData)
                var linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                binding.rvListWeather.layoutManager = linearLayout
                binding.rvListWeather.adapter = adapterWeather
            } else if (itemSelected == "2016") {
                Toast.makeText(this, "Years: $itemSelected", Toast.LENGTH_SHORT).show()
                val weatherData = WeatherData.listWeather.filter { it.years == "2016" }
                adapterWeather = WeatherItemAdapter(weatherData)
                var linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                binding.rvListWeather.layoutManager = linearLayout
                binding.rvListWeather.adapter = adapterWeather
            }
            else if (itemSelected == "2017") {
                Toast.makeText(this, "Years: $itemSelected", Toast.LENGTH_SHORT).show()
                val weatherData = WeatherData.listWeather.filter { it.years == "2017" }
                adapterWeather = WeatherItemAdapter(weatherData)
                var linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                binding.rvListWeather.layoutManager = linearLayout
                binding.rvListWeather.adapter = adapterWeather
            }
            else if (itemSelected == "2018") {
                Toast.makeText(this, "Years: $itemSelected", Toast.LENGTH_SHORT).show()
                val weatherData = WeatherData.listWeather.filter { it.years == "2018" }
                adapterWeather = WeatherItemAdapter(weatherData)
                var linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                binding.rvListWeather.layoutManager = linearLayout
                binding.rvListWeather.adapter = adapterWeather
            }
            else if (itemSelected == "2019") {
                Toast.makeText(this, "Years: $itemSelected", Toast.LENGTH_SHORT).show()
                val weatherData2018 = WeatherData.listWeather.filter { it.years == "2019" }
                adapterWeather = WeatherItemAdapter(weatherData2018)
                var linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                binding.rvListWeather.layoutManager = linearLayout
                binding.rvListWeather.adapter = adapterWeather
            }
            else if (itemSelected == "2020") {
                Toast.makeText(this, "Years: $itemSelected", Toast.LENGTH_SHORT).show()
                val weatherData = WeatherData.listWeather.filter { it.years == "2020" }
                adapterWeather = WeatherItemAdapter(weatherData)
                var linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                binding.rvListWeather.layoutManager = linearLayout
                binding.rvListWeather.adapter = adapterWeather
            }
            else if (itemSelected == "All Years") {
                Toast.makeText(this, "Years: $itemSelected", Toast.LENGTH_SHORT).show()
                val weatherData = WeatherData.listWeather
                adapterWeather = WeatherItemAdapter(weatherData)
                var linearLayout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
                binding.rvListWeather.layoutManager = linearLayout
                binding.rvListWeather.adapter = adapterWeather
            }
            adapterWeather.onClick = { selectedWeatherData ->
                binding.tvCloud.text = selectedWeatherData.weatherdesc
                binding.tvTemp.text = selectedWeatherData.temp
                binding.tvPressure.text = selectedWeatherData.pressure
                binding.tvHumidity.text = selectedWeatherData.humidity
                binding.tvWind.text = selectedWeatherData.wind
                binding.tvDatetime.text = selectedWeatherData.datetime
                binding.ivWeather.setImageResource(selectedWeatherData.image)
                Toast.makeText(this, "${selectedWeatherData.datetime}", Toast.LENGTH_SHORT).show()
            }
        }

        adapterWeather = WeatherItemAdapter(WeatherData.listWeather)
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
            Toast.makeText(this, "${selectedWeatherData.datetime}", Toast.LENGTH_SHORT).show()
        }
    }
}