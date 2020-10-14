package com.example.demo.service;

import com.example.demo.designPatternType.WeatherStrategy;

/**
 * @Desc:
 * @Author sh-zxgs-wangyy
 * @Date 2020/10/12
 */
public class StrategyService {
    private WeatherStrategy strategy;

    public void get(String type){
        strategy = new WeatherStrategy(type);
        strategy.getWeather();
    }

    public static void main(String[] args) {
        new StrategyService().get("rain");
    }
}
