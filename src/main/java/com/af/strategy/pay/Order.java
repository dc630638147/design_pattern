package com.af.strategy.pay;

/**
 * 订单
 */
public class Order {

    private String uid;
    private double balance;
    private String orderId;

    public Order(String uid, String orderId, double balance){
        this.uid = uid;
        this.orderId = orderId;
        this.balance = balance;
    }

    public void pay() {
        pay(PayFactory.DEFAULT);
    }

    public PayState pay(String payKey){
        Payment pay = PayFactory.pay(payKey);
        return pay.pay(uid, balance);
    }
}
