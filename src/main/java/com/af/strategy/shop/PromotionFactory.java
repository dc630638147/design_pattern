package com.af.strategy.shop;

import java.util.HashMap;
import java.util.Map;

/**
 * 促销工厂
 */
public class PromotionFactory {

    private static Map<String, PromotionStrategy> map = new HashMap<String, PromotionStrategy>();

    static {
        //添加促销活动
        map.put(PromotionKey.cashback, new CashbackStrategy());
        map.put(PromotionKey.coupon, new CouponStrategy());
        map.put(PromotionKey.groupbuy, new GroupbuyStrategy());
    }

    //设置默认的促销方式-->无任何促销活动
    private static final PromotionStrategy DEFAULT_STRATEGY = new EmptyStrategy();


    public static PromotionStrategy getStrategy(String promotion) {
        PromotionStrategy promotionStrategy = map.get(promotion);
        return promotionStrategy == null ? DEFAULT_STRATEGY : promotionStrategy;
    }


    //key
    private interface PromotionKey {
        String cashback = "CASHBACK";
        String coupon = "COUPON";
        String groupbuy = "GROUPBUY";
    }
}
