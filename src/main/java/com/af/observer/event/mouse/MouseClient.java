package com.af.observer.event.mouse;

/**
 * Created by Administrator on 2019/8/17.
 */
public class MouseClient {

    public static void main(String[] args) {
        //创建回调对象
        MouseCallback callback = new MouseCallback();
        Mouse mouse = new Mouse();
        //注册事件
        mouse.addListener(MouseEventType.ON_CLCK,callback);
        //执行事件
        mouse.click();
    }
}
