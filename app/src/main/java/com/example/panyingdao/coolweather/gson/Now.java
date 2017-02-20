package com.example.panyingdao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by panyingdao on 2017/2/20.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
