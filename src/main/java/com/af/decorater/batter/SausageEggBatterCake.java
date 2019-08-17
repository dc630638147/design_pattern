package com.af.decorater.batter;

/**
 * Created by Administrator on 2019/8/17.
 */
public class SausageEggBatterCake extends EggBatterCaker {
    @Override
    protected String msg() {
        return super.msg()+",加了个香肠";
    }

    //加个香肠
    @Override
    public int price() {
        return super.price()+2;
    }
}
