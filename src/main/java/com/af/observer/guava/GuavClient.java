package com.af.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * Created by Administrator on 2019/8/17.
 */
public class GuavClient {
    public static void main(String[] args) {
        //回调对象
        GuavaEvent event = new GuavaEvent();

        //消息对象初始化
        EventBus bus = new EventBus();
        //注册, 可以注册多个实现广播
        bus.register(event);
        //出发时间
        bus.post("1000");

    }
}
