package com.example.demo.abstractFactory;

/**
 * @desc:
 * @author: wangyaoyao
 * @date: 2020/10/14 14:51
 */
public class ModernChair implements Chair {
    @Override
    public void getChair() {
        System.out.println("这是一把现代风格的椅子");
    }
}
