package com.example.demo.abstractFactory;

/**
 * @desc:
 * @author: wangyaoyao
 * @date: 2020/10/14 14:52
 */
public class ModernDesk implements Desk {
    @Override
    public void getDesk() {
        System.out.println("这是一把现代风格的桌子");
    }
}
