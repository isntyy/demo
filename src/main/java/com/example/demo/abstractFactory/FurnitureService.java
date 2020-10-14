package com.example.demo.abstractFactory;

/**
 * @desc:
 * @author: wangyaoyao
 * @date: 2020/10/14 14:55
 */
public class FurnitureService {

    public static void main(String[] args) {
        FurnitureFactory factory = new EuropeFactory();
        Chair chair = factory.getChair();
        Desk desk = factory.getDesk();

        chair.getChair();
        desk.getDesk();

    }
}
