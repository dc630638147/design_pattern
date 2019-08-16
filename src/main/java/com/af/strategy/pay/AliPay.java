package com.af.strategy.pay;

/**
 * 支付宝
 */
public class AliPay extends Payment {

    public String getName() {
        return "支付宝";
    }

    public double queryBlance(String uid) {
        return 500;
    }
}
