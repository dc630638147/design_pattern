package com.af.strategy.pay;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付工厂
 */
public class PayFactory {
    private PayFactory(){}

    private static Map<String,Payment> map = new HashMap<String,Payment>();

    public static final String ALI = "alipay";
    public static final String JD = "jdpay";
    public static final String WX = "wxPay";
    public static final String DEFAULT = ALI;

    static {
        map.put(ALI,new AliPay());
        map.put(JD,new JdPay());
        map.put(WX,new WxPay());
    }

    public static Payment pay(String pay){
        if(map.containsKey(pay)){
            return map.get(pay);
        }
        return map.get(DEFAULT);
    }

}
