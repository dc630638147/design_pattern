package com.af.observer.answer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2019/8/17.
 * 接受消息通知
 */
public class Teacher implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public Teacher(String name){
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        //强转
        Gper gper = (Gper) o;
        Question question = (Question) arg;
        System.out.println("==========接收到了消息==========");
        System.out.println("收到了来自:"+question.getUserName()+"的提问，内容是:"+question.getContent());
    }
}
