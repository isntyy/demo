package com.example.demo.abstractFactory;

/**
 * @desc:
 * @author: wangyaoyao
 * @date: 2020/10/14 14:56
 */
public class EuropeChair implements Chair {
    @Override
    public void getChair() {
        System.out.println("这是一把欧洲风的椅子");
    }
}
