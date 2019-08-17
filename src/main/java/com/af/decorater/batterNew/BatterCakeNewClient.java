package com.af.decorater.batterNew;

/**
 * Created by Administrator on 2019/8/17.
 */
public class BatterCakeNewClient {
    public static void main(String[] args) {
        //基础鸡蛋套餐
        BatterCake batterCake = new BaseBatterCake();
        batterCake = new EggBatterCake(batterCake);
        batterCake = new SausageBatterCake(batterCake);
        System.out.println(batterCake.msg()+":"+batterCake.price());
    }
}
