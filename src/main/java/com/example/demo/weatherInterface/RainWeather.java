package com.example.demo.weatherInterface;

/**
 * @Desc:
 * @Author sh-zxgs-wangyy
 * @Date 2020/10/12
 */
public class RainWeather implements Weather {

    @Override
    public void getWeather() {
        System.out.println("rain");
    }
}
