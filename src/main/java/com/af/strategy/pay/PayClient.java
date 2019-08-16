package com.af.strategy.pay;


public class PayClient {
    public static void main(String[] args) {
        Order order = new Order("111","222",300);
        System.out.println(order.pay(PayFactory.ALI));
    }
}
