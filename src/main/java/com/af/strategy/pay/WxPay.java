package com.af.strategy.pay;

/**
 * 微信支付
 */
public class WxPay extends Payment {
    public String getName() {
        return "微信支付";
    }

    public double queryBlance(String uid) {
        return 2000;
    }
}
