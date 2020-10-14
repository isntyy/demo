package com.example.demo.service;

import com.example.demo.designPatternType.WeatherFactory;
import com.example.demo.weatherInterface.Weather;

/**
 * @Desc:
 * @Author sh-zxgs-wangyy
 * @Date 2020/10/12
 */
public class FactoryService {
    private static WeatherFactory factory = new  WeatherFactory();

    public void get(String type){
        Weather weather = factory.create(type);
        weather.getWeather();
    }

    public static void main(String[] args) {
        new FactoryService().get("rain1");
    }
}
