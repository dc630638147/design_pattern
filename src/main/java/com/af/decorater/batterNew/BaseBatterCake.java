package com.af.decorater.batterNew;

/**
 * 鸡蛋煎饼基础套餐
 */
public class BaseBatterCake extends BatterCake {


    protected String msg() {
        return "煎饼";
    }

    protected int price() {
        return 5;
    }
}
