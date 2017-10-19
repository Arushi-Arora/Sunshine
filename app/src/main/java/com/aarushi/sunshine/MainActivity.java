package com.aarushi.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Weather> weatherArrayList;
    TextView tvWeatherDescription,tvDate,tvWeatherLow,tvWeatherHigh;

    RecyclerView weatherRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherRecyclerView=(RecyclerView)findViewById(R.id.rvWeatherData);

        weatherArrayList=new ArrayList<>();
        weatherArrayList.add(new Weather("Today, May 17"," Clear"," - 17°C "," 15°C"));
        weatherArrayList.add(new Weather("Tomorrow, May 18"," Cloudy"," - 19°C" ," 15°C"));
        weatherArrayList.add(new Weather("Friday"," Thunderstorms"," - 21°C "," 9°C"));
        weatherArrayList.add(new Weather("Saturday", " Thunderstorms", "- 16°C", " 7°C"));
        weatherArrayList.add(new Weather("Sunday"," Rainy", "- 16°C "," 8°C"));
        weatherArrayList.add(new Weather("Monday"," Partly Cloudy"," - 15°C ", "10°C"));
        weatherArrayList.add(new Weather("Tue, May 24", " Meatballs", "- 16°C ", "18°C"));
        weatherArrayList.add(new Weather("Wed, May 25"," Clear"," - 17°C "," 15°C"));
        weatherArrayList.add(new Weather("Thursday, May 26"," Cloudy"," - 19°C" ," 15°C"));
        weatherArrayList.add(new Weather("Friday, May 28"," Thunderstorms"," - 21°C "," 9°C"));
        weatherArrayList.add(new Weather("Saturday, May 29", " Thunderstorms", "- 16°C", " 7°C"));
        weatherArrayList.add(new Weather("Sunday, May30"," Rainy", "- 16°C "," 8°C"));
        weatherArrayList.add(new Weather("Monday, May31"," Partly Cloudy"," - 15°C ", "10°C"));

        WeatherAdapter weatherAdapter=new WeatherAdapter(weatherArrayList,this);
        weatherRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        weatherRecyclerView.setAdapter(weatherAdapter);



    }
}
