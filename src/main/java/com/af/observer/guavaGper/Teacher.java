package com.af.observer.guavaGper;

import com.google.common.eventbus.Subscribe;

/**
 * Created by Administrator on 2019/8/17.
 */
public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void anser(String str) {
        System.out.println(name + "===" + str);
    }
}
