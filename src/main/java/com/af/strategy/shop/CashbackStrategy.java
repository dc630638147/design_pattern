package com.af.strategy.shop;

/**
 * 返现抵扣
 */
public class CashbackStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("返现抵扣促销");
    }
}
