package com.af.strategy.pay;


public abstract class Payment {

    public abstract String getName();

    public abstract double queryBlance(String uid);

    public PayState pay(String uid,double balance){
        if(queryBlance(uid) < balance){
            return new PayState(500,"余额不足",null);
        }
        return new PayState(200,"支付成功",null);
    }

}
