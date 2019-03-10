package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * "lifestyle":[
 *                                        {
 * 						"type":"comf",
 * 						"brf":"较舒适",
 * 						"txt":"白天会有降雨，这种天气条件下，人们会感到有些凉意，但大部分人完全可以接受。"
 *                    },{},{},{},{},{},{}]
 */
public class Lifestyle {

    @SerializedName("txt")
    public String txt;

}