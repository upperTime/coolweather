package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * "daily_forecast":[
 *                                {
 * 					"cond_code_d":"305",
 * 					"cond_code_n":"101",
 * 					"cond_txt_d":"小雨",
 * 					"cond_txt_n":"多云",
 * 					"date":"2019-03-10",
 * 					"hum":"23",
 * 					"mr":"08:32",
 * 					"ms":"21:40",
 * 					"pcpn":"0.0",
 * 					"pop":"6",
 * 					"pres":"1010",
 * 					"sr":"06:32",
 * 					"ss":"18:16",
 * 					"tmp_max":"13",
 * 					"tmp_min":"2",
 * 					"uv_index":"0",
 * 					"vis":"24",
 * 					"wind_deg":"351",
 * 					"wind_dir":"北风",
 * 					"wind_sc":"1-2",
 * 					"wind_spd":"5"
 *                },{},{}],
 */
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
