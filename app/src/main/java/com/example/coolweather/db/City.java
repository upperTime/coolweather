package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * [
 *  {"id":937,"name":"苏州","weather_id":"CN101190401"},
 *  {"id":938,"name":"常熟","weather_id":"CN101190402"},
 *  {"id":939,"name":"张家港","weather_id":"CN101190403"},
 *  {"id":940,"name":"昆山","weather_id":"CN101190404"},
 *  {"id":941,"name":"吴中","weather_id":"CN101190405"},
 *  ...]*/
public class City extends DataSupport {
    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }


}
