package com.af.factory.simpleFactory;

import com.af.factory.ICourse;
import com.af.factory.JavaCourse;
import com.af.factory.PythonCourse;

/**
 * @ClassName CourseFactory
 * @Description 课程工厂
 * @Author af
 * @Date 2019/8/14 9:53
 * @Version 1.0
 **/
public class CourseFactory {

    /**
     * 根据名字判断选择工厂
     *
     * @param name
     * @return
     */
    public ICourse createOne(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }

    /**
     * 根据类名创建
     *
     * @return
     */
    public ICourse createTwo(String className) {
        try {
            if (className != null && className != "") {
                return  (ICourse) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 通过class对象
     * @return
     */
    public ICourse createThree(Class <? extends ICourse> clazz){
        try{
            if(null != clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
