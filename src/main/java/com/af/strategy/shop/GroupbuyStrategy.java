package com.af.strategy.shop;

/**
 * 拼团优惠促销
 */
public class GroupbuyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("拼团优惠");
    }
}
