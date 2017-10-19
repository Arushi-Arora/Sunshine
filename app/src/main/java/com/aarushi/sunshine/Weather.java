package com.aarushi.sunshine;

/**
 * Created by arushiarora on 10/19/2017.
 */

public class Weather {
    String date;
    String description;
    String low;
    String high;

    public Weather(String date, String description, String low, String high) {
        this.date = date;
        this.description = description;
        this.low = low;
        this.high = high;
    }

    public void setDate(String date) {

        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getDate() {

        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getLow() {
        return low;
    }

    public String getHigh() {
        return high;
    }
}
