package com.example.coolweather.gson;

/**
 * "basic":
 *                                {
 * 					"cid":"CN101010100",
 * 					"location":"北京",
 * 					"parent_city":"北京",
 * 					"admin_area":"北京",
 * 					"cnty":"中国",
 * 					"lat":"39.90498734",
 * 					"lon":"116.4052887",
 * 					"tz":"+8.00"
 *                },
 */

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("cid")
    public String weatherId;

    @SerializedName("location")
    public String cityName;

    @SerializedName("parent_city")
    public String city;

    @SerializedName("admin_area")
    public String province;


}
