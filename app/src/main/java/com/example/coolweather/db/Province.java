package com.example.coolweather.db;

import org.litepal.crud.DataSupport;


/**
 *  * [
 *  * {"id":1,"name":"北京"},
 *  * {"id":2,"name":"上海"},
 *  * {"id":3,"name":"天津"},
 *  * {"id":4,"name":"重庆"},
 *  * {"id":5,"name":"香港"},
 *  * {"id":6,"name":"澳门"}
 *  * ...]*/


public class Province extends DataSupport {
    private int id;

    private String provinceName;

    private int provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }
}
