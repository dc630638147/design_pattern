package com.af.decorater.batterNew;

/**
 * Created by Administrator on 2019/8/17.
 */
public abstract class BatterCakeDecorator extends BatterCake {
    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected abstract void doSomething();

    protected String msg() {
        return batterCake.msg();
    }

    protected int price() {
        return batterCake.price();
    }
}
