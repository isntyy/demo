package com.example.demo.designPatternType;

import com.example.demo.weatherInterface.RainWeather;
import com.example.demo.weatherInterface.SnowWeather;
import com.example.demo.weatherInterface.Weather;

/**
 * @Desc: 策略
 * @Author sh-zxgs-wangyy
 * @Date 2020/10/12
 */
public class WeatherStrategy {

    private Weather weather;

    public WeatherStrategy(String type){
        if ("rain".equals(type)){
            weather = new RainWeather();
        }else if ("snow".equals(type)){
            weather = new SnowWeather();
        }else {
            System.out.println("no type weather..");
        }
    }

    public void getWeather(){
        weather.getWeather();
    }
}
