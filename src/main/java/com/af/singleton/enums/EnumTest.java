package com.af.singleton.enums;

import java.io.File;

/**
 * 枚举单例
 * 1、安全线程以及唯一
 * 2、避免反射攻击以及序列化
 */
public class EnumTest {
    public static void main(String[] args) throws Exception {
       /*EnumSingleton enumSingleton = EnumSingleton.getSingleton();
       EnumSingleton enumSingleton2 = EnumSingleton.getSingleton();
        enumSingleton.setData("aa");
        System.out.println(" 地址:"+enumSingleton);
        System.out.println("地址:"+enumSingleton2);*/

        ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
            public void handler() {
                Pojo pojo = EnumSingletonAc.INSTANCE.getPojo();
                System.out.println(pojo);
            }
        },10,6);


    }

    private static void FileSeriable(){

    }
}
