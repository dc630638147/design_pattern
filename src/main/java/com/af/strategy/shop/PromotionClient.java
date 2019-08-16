package com.af.strategy.shop;

/**
 * 促销执行
 */
public class PromotionClient {

    public static void main(String[] args) {
        //获取促销活动
        String promotion = "COUPON";
        PromotionStrategy strategy = PromotionFactory.getStrategy(promotion);

        PromotionActity promotionActity = new PromotionActity(strategy);
        promotionActity.doAction();
    }
}
