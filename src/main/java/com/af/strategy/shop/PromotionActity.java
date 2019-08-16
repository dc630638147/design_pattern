package com.af.strategy.shop;

/**
 * 促销活动
 */
public class PromotionActity {

    private PromotionStrategy promotionStrategy;

    public PromotionActity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void doAction(){
        promotionStrategy.doPromotion();
    }
}
