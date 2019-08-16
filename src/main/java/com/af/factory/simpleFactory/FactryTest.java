package com.af.factory.simpleFactory;

import com.af.factory.ICourse;
import com.af.factory.JavaCourse;

/**
 * @ClassName FactryTest
 * @Description 抽象工厂
 * @Author af
 * @Date 2019/8/14 9:56
 * @Version 1.0
 **/
public class FactryTest {
    public static void main(String[] args) {
        //根据名字
       /* CourseFactory courseFactory = new CourseFactory();
        ICourse java = courseFactory.createOne("java");
        if(null != java){
            java.record();
        }*/

        //根据类名
        /*CourseFactory courseFactory = new CourseFactory();
        ICourse pythonCourse = courseFactory.createTwo("com.af.factory.PythonCourse");
        if (pythonCourse != null) {
            pythonCourse.record();
        }*/

        CourseFactory courseFactory = new CourseFactory();
        ICourse javaCourse = courseFactory.createThree(JavaCourse.class);
        if(null != javaCourse){
            javaCourse.record();
        }
    }
}
