package com.af.decorater.batter;

/**
 * Created by Administrator on 2019/8/17.
 */
public class BatterCakeClent {
    public static void main(String[] args) {
        BatterCake cake = new BatterCake();
        System.out.println(cake.msg()+":"+cake.price());
        EggBatterCaker eggBatterCaker = new EggBatterCaker();
        System.out.println(eggBatterCaker.msg()+":"+eggBatterCaker.price());
        SausageEggBatterCake sausageEggBatterCake = new SausageEggBatterCake();
        System.out.println(sausageEggBatterCake.msg()+":"+sausageEggBatterCake.price());
    }
}
