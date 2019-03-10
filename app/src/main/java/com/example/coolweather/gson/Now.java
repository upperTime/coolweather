package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * "now":
 *                                {
 * 					"cloud":"0",
 * 					"cond_code":"101",
 * 					"cond_txt":"多云",
 * 					"fl":"7",
 * 					"hum":"47",
 * 					"pcpn":"0.0",
 * 					"pres":"1018",
 * 					"tmp":"10",
 * 					"vis":"4",
 * 					"wind_deg":"99",
 * 					"wind_dir":"东风",
 * 					"wind_sc":"2",
 * 					"wind_spd":"8"
 *                },
 */
public class Now {
    @SerializedName("tmp")
    public String tempeature;

    @SerializedName("cond_txt")
    public String cond;

}