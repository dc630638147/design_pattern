package com.af.observer.answer;

import java.util.Observable;

/**
 * =问答平台
 * 被观察者
 */
public class Gper extends Observable{
    private String name = "gp生态圈";

    private static Gper gper = null;

    public static Gper getInstance(){
        if(gper == null){
            gper = new Gper();
        }
        return gper;
    }

    public String getName(){
        return name;
    }

    //提问
    public void publishQusetion(Question q){
        System.out.println("发起提问:"+q.getUserName()+":"+q.getContent());
        //通知观察者
        setChanged();
        notifyObservers(q);
    }
}
