package com.af.observer.guavaGper;

import com.af.observer.answer.Question;
import com.google.common.eventbus.EventBus;

/**
 * Created by Administrator on 2019/8/17.
 */
public class Geper {

    private String name = "gper课程平台";

    public void question(Question question,String teacherName){
        System.out.println("学生提问");
        if(teacherName == null || teacherName == ""){
            teacherName = TeacherFactory.DEFAULT_TEACHER;
        }
        //找老师解答
        Teacher teacher = TeacherFactory.getTeacher(teacherName);
        EventBus bus = new EventBus();
        bus.register(teacher);
        bus.post(question.getUserName()+":"+question.getContent());
    }
}
