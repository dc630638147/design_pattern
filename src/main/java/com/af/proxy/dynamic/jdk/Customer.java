package com.af.proxy.dynamic.jdk;

/**
 * @ClassName Customer
 * @Description 被代理的类
 * @Author
 * @Date 2019/8/15 11:31
 * @Version 1.0
 **/
public class Customer implements Persion {
    public void findLove() {
        System.out.println("我是高富帅，我要找对象");
    }
}
