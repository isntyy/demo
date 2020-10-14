package com.example.demo.weatherInterface;

/**
 * @desc:
 * @author: wangyaoyao
 * @date: 2020/10/14 14:24
 */
public class SellerProxy implements Sell {
    private Seller seller;

    @Override
    public void sell() {
        if (seller == null){
            seller = new Seller();
        }
        seller.sell();

        // 可以做卖房的事情
        System.out.println("退税");
    }
}
