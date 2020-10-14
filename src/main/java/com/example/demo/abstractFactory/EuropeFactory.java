package com.example.demo.abstractFactory;

/**
 * @desc:
 * @author: wangyaoyao
 * @date: 2020/10/14 14:58
 */
public class EuropeFactory implements FurnitureFactory {
    @Override
    public Desk getDesk() {
        return new EuropeDesk();
    }

    @Override
    public Chair getChair() {
        return new EuropeChair();
    }
}
