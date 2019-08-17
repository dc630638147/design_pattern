package com.af.observer.event.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 监听器
 */
public class EventListener {
    //创建map，存储事件的注册，jdk底层也是这么设计的
    protected Map<String, Event> eventMap = new HashMap<String, Event>();

    //事件触发
    public void addListener(String eventType, Object target) {
        try {
            this.addListener(eventType,target,
                    target.getClass() .getMethod("on"+toUpperFirstCase(eventType),Event.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void addListener(String eventType, Object target, Method callback) {
        //注册事件
        eventMap.put(eventType,new Event(target,callback));
    }

    //触发,时间触发，执行回调
    protected void trigger(String trigger){
        if(!eventMap.containsKey(trigger)){
            return;
        }
        Event event = eventMap.get(trigger);
        triggerEvent(event);
    }

    private void triggerEvent(Event event){
        event.setSource(this);//方便链路
        event.setTime(System.currentTimeMillis());
        //发起回调执行
        if(event.getCallback() !=null){
            try {
                event.getCallback().invoke(event.getTarget(),event);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    //逻辑处理的私有方法，首字母大写
    private String toUpperFirstCase(String str){
        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
