package com.af.strategy.shop;

/**
 * 优惠劵抵扣
 */
public class CouponStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("优惠劵抵扣促销");
    }
}
