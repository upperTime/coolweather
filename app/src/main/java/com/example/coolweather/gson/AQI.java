package com.example.coolweather.gson;
import com.google.gson.annotations.SerializedName;


public class AQI {

    @SerializedName("aqi")
    public String aqi;

    @SerializedName("pm25")
    public String pm25;

}
