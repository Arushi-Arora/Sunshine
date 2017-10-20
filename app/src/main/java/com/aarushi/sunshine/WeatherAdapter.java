package com.aarushi.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by arushiarora on 10/17/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>{

    ArrayList<Weather> weatherArrayList;
    Context context;
    public WeatherAdapter(ArrayList<Weather> weatherArrayList,Context context){
        this.weatherArrayList=weatherArrayList;
        this.context=context;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = li.inflate(R.layout.forecast_item
                ,parent,false);
        WeatherViewHolder weatherViewHolder=new WeatherViewHolder(itemView);
        return weatherViewHolder;
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {
        Weather weather=weatherArrayList.get(position);
        holder.tvDate.setText(weather.getDate());
        holder.tvWeatherDescription.setText(weather.getDescription());
        holder.tvWeatherLow.setText(weather.getLow());
        holder.tvWeatherHigh.setText(weather.getHigh());
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return weatherArrayList.size();
    }

    static class WeatherViewHolder extends RecyclerView.ViewHolder{

        ImageView ivWeatherType;
        TextView tvDate,tvWeatherDescription,tvWeatherLow,tvWeatherHigh;
        public WeatherViewHolder(View itemView) {
            super(itemView);
            ivWeatherType=(ImageView)itemView.findViewById(R.id.ivWeatherType);
            tvDate=(TextView)itemView.findViewById(R.id.tvDate);
            tvWeatherDescription=(TextView)itemView.findViewById(R.id.tvWeatherDescription);
            tvWeatherLow=(TextView)itemView.findViewById(R.id.tvWeatherLow);
            tvWeatherHigh=(TextView)itemView.findViewById(R.id.tvWeatherHigh);
        }
    }
}
