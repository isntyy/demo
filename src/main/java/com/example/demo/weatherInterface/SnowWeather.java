package com.example.demo.weatherInterface;

/**
 * @Desc:
 * @Author sh-zxgs-wangyy
 * @Date 2020/10/12
 */
public class SnowWeather implements Weather {

    @Override
    public void getWeather() {
        System.out.println("snow");
    }
}
