package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("date")
    public String date;

    @SerializedName("cond_txt_n")
    public String cond;

    @SerializedName("tmp_max")
    public String tmpMax;

    @SerializedName("tmp_min")
    public String tmpMin;

}
