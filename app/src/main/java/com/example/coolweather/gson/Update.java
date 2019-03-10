package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * "update":
 *                                {
 * 					"loc":"2019-03-10 11:55",
 * 					"utc":"2019-03-10 03:55"
 *                },
 */
public class Update{
    @SerializedName("loc")
    public String updateTime;
}