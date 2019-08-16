package com.af.strategy.pay;

/**
 * 京东白条
 */
public class JdPay extends Payment{
    public String getName() {
        return "京东白条";
    }

    public double queryBlance(String uid) {
        return 1000;
    }
}
