package com.af.decorater.batter;

/**
 * 鸡蛋煎饼
 */
public class EggBatterCaker extends BatterCake {
    @Override
    protected String msg() {
        return super.msg()+"，加了个鸡蛋";
    }

    //加了个鸡蛋
    @Override
    public int price() {
        return super.price()+1;
    }
}
