package com.af.decorater.batterNew;

/**
 * 加个鸡蛋
 */
public class EggBatterCake extends BatterCakeDecorator {

    public EggBatterCake(BatterCake batterCake) {
        super(batterCake);
    }

    protected void doSomething() {

    }

    @Override
    protected String msg() {
        return super.msg()+"加个鸡蛋";
    }

    @Override
    protected int price() {
        return super.price()+1;
    }
}
