package com.af.observer.guavaGper;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2019/8/17.
 */
public class TeacherFactory {
    private static Map<String,Teacher> teacherMap = new TreeMap<String, Teacher>();
    public static String TOM="tom";
    public static String CAT="CAT";
    public static String DEFAULT_TEACHER = TOM;
    static {
        teacherMap.put(TOM,new Teacher(TOM));
        teacherMap.put(CAT,new Teacher(CAT));
    }

    public static Teacher getTeacher(String name){
        if(teacherMap.containsKey(name)){
            return teacherMap.get(name);
        }
        return teacherMap.get(DEFAULT_TEACHER);
    }

}
