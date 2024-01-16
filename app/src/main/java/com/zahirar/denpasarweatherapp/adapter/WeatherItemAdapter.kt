package com.zahirar.denpasarweatherapp.adapter

import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.zahirar.denpasarweatherapp.databinding.ItemWeatherBinding
import com.zahirar.denpasarweatherapp.model.WeatherDataClass

class WeatherItemAdapter(val listWeather: List<WeatherDataClass>): RecyclerView.Adapter<WeatherItemAdapter.ViewHolder>() {

    var onClick : ((WeatherDataClass) -> Unit)? = null

    class ViewHolder(var binding: ItemWeatherBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherItemAdapter.ViewHolder {
        var view = ItemWeatherBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: WeatherItemAdapter.ViewHolder, position: Int) {
        holder.binding.tvItemCloud.text = listWeather[position].weatherdesc
        holder.binding.tvItemTemp.text = listWeather[position].temp
        holder.binding.tvItemPressure.text = listWeather[position].pressure
        holder.binding.tvItemHumidity.text = listWeather[position].humidity
        holder.binding.tvItemWind.text = listWeather[position].wind
        holder.binding.tvItemDate.text = listWeather[position].datetime
        holder.binding.ivItemWeather.setImageResource(listWeather[position].image)
        holder.binding.cvItemWeather.setOnClickListener{
            onClick?.invoke(listWeather[position])
        }
    }

    override fun getItemCount(): Int {
        return listWeather.size
    }
}