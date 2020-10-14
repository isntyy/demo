package com.example.demo.abstractFactory;

/**
 * @desc:
 * @author: wangyaoyao
 * @date: 2020/10/14 14:57
 */
public class EuropeDesk implements Desk {
    @Override
    public void getDesk() {
        System.out.println("这是一把欧洲风的桌子");
    }
}
