package com.example.panyingdao.coolweather.gson;

/**
 * Created by panyingdao on 2017/2/20.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
