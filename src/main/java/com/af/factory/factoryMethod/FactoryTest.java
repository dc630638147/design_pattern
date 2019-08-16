package com.af.factory.factoryMethod;

import com.af.factory.ICourse;

/**
 * @ClassName FactoryTest
 * @Description TODO
 * @Author {USER}
 * @Date 2019/8/14 10:29
 * @Version 1.0
 **/
public class FactoryTest {
    public static void main(String[] args) {
        JavaFactory javaFactory = new JavaFactory();
        ICourse iCourse = javaFactory.create();
        iCourse.record();
    }
}
