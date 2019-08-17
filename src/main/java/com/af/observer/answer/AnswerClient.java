package com.af.observer.answer;

/**
 * Created by Administrator on 2019/8/17.
 */
public class AnswerClient {
    public static void main(String[] args) {
        //创建被观察者对象
        Gper gper = new Gper();

        //创建被通知对象教师
        Teacher t1 = new Teacher("tom");
        Teacher t2 = new Teacher("cat");

        //两者绑定
        gper.addObserver(t1);
        gper.addObserver(t2);

        //创建问题提问
        Question question = new Question();
        question.setUserName("小超");
        question.setContent("打不死的小强怎么死的");
        //进行提问
        gper.publishQusetion(question);
    }
}
