package com.af.observer.guavaGper;

import com.af.observer.guavaGper.Geper;
import com.af.observer.answer.Question;

/**
 * Created by Administrator on 2019/8/17.
 */
public class Client {

    public static void main(String[] args) {
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("问题问题");
        Geper gper = new Geper();
        gper.question(question,"tom");

    }
}
