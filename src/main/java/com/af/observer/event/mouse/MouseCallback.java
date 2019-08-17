package com.af.observer.event.mouse;

import com.af.observer.event.core.Event;

/**
 * Created by Administrator on 2019/8/17.
 */
public class MouseCallback {

    public void onClick(Event e){
        System.out.println("====回调了click方法");
    }

    public void onDoubleClick(){
        System.out.println("=====回调doubleClick方法");
    }

    public void onMove(){
        System.out.println("====回调了move方法 =");
    }
}
