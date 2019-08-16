package com.af.singleton.hunger;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName HungerTest
 * @Description
 * @Author
 * @Date 2019/8/14 11:52
 * @Version 1.0
 **/
public class HungerTest {
    public static void main(String[] args) throws Exception {
       HungerSingleton hungerSingleton = HungerSingleton.getHungerSingleton();
        System.out.println(hungerSingleton);
        HungerSingleton hungerSingleton1 = HungerSingleton.getHungerSingleton();
        System.out.println(hungerSingleton1);


        reflect();
    }

    /**
     * 反射攻击
     */
    private static void reflect() throws Exception {
        Class<HungerSingleton> hungerSingletonClass = HungerSingleton.class;
        Constructor<HungerSingleton> declaredConstructor = hungerSingletonClass.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);//暴力打开私有构造
        HungerSingleton hungerSingleton = declaredConstructor.newInstance();
        System.out.println(hungerSingleton);
    }
}
