package com.example.demo.designPatternType;

import com.example.demo.weatherInterface.RainWeather;
import com.example.demo.weatherInterface.SnowWeather;
import com.example.demo.weatherInterface.Weather;

/**
 * @Desc: 工厂
 * @Author sh-zxgs-wangyy
 * @Date 2020/10/12
 */
public class WeatherFactory {

    public Weather create(String type){
        if ("rain".equals(type)){
            return new RainWeather();
        }else if ("snow".equals(type)){
            return new SnowWeather();
        }else {
            System.out.println("no type weather..");
        }
        return null;
    }
}
