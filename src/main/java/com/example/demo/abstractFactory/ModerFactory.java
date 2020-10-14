package com.example.demo.abstractFactory;

/**
 * @desc:
 * @author: wangyaoyao
 * @date: 2020/10/14 14:53
 */
public class ModerFactory implements FurnitureFactory {

    @Override
    public Desk getDesk() {
        return new ModernDesk();
    }

    @Override
    public Chair getChair() {
        return new ModernChair();
    }
}
