package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * [
 * {"id":113,"name":"南京"},
 * {"id":114,"name":"无锡"},
 * {"id":115,"name":"镇江"},
 * {"id":116,"name":"苏州"},
 * {"id":117,"name":"南通"}
 * ...]*/
public class County extends DataSupport {
    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }


}
