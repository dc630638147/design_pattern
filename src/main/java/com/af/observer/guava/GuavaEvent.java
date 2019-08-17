package com.af.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * 执行方法
 */
public class GuavaEvent {

    @Subscribe
    public void action(String str){
        System.out.println("方法被调用了:"+str);
    }
}
