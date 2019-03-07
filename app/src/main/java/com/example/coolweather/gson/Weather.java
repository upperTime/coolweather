package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    @SerializedName("status")
    public String status;

    @SerializedName("basic")
    public Basic basic;


    @SerializedName("now")
    public Now now;

    @SerializedName("update")
    public Update update;

    @SerializedName("lifestyle")
    public List<Lifestyle> lifestyleList;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}

