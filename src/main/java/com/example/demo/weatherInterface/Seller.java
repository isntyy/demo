package com.example.demo.weatherInterface;

/**
 * @desc:
 * @author: wangyaoyao
 * @date: 2020/10/14 14:24
 */
public class Seller implements Sell{
    @Override
    public void sell() {
        System.out.println("卖了房子");
    }
}
