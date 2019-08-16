package com.af.factory.factoryMethod;

import com.af.factory.ICourse;
import com.af.factory.JavaCourse;

/**
 * @ClassName JavaFactory
 * @Description java工厂
 * @Author af
 * @Date 2019/8/14 10:14
 * @Version 1.0
 **/
public class JavaFactory implements ICourseFactory{

    public ICourse create() {
        return new JavaCourse();
    }
}
