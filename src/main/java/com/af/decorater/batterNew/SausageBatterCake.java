package com.af.decorater.batterNew;

/**
 * Created by Administrator on 2019/8/17.
 */
public class SausageBatterCake extends BatterCakeDecorator {
    public SausageBatterCake(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String msg() {
        return super.msg()+"加个香肠";
    }

    @Override
    protected int price() {
        return super.price()+2;
    }

    protected void doSomething() {

    }
}
