package com.af.observer.event.mouse;


import com.af.observer.event.core.Event;
import com.af.observer.event.core.EventListener;

/**
 * Created by Administrator on 2019/8/17.
 */
public class Mouse extends EventListener {


    public void click(){
        System.out.println("调用单击");
        //触发事件
        this.trigger(MouseEventType.ON_CLCK);
    }

    public void doubleClick(){
        System.out.println("调用双击");
        this.trigger(MouseEventType.DOUBLE_CLICK);
    }

    public void move(){
        System.out.println("调用移动");
        this.trigger(MouseEventType.move);
    }
}
