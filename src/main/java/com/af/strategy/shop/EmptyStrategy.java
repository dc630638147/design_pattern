package com.af.strategy.shop;

public class EmptyStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("无优惠促销");
    }
}
