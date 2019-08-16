package com.af.factory.factoryMethod;/**
 * Created by ywwl on 2019/8/14.
 */

import com.af.factory.ICourse;
import com.af.factory.PythonCourse;

/**
 * @ClassName PythonFactory
 * @Description python课程工厂
 * @Author af
 * @Date 2019/8/14 10:28
 * @Version 1.0
 **/
public class PythonFactory implements ICourseFactory{

    public ICourse create() {
        return new PythonCourse();
    }
}
