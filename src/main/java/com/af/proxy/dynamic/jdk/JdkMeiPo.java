package com.af.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName JdkMeiPo
 * @Description jdk动态代理实现方式
 * @Author
 * @Date 2019/8/15 11:20
 * @Version 1.0
 **/
public class JdkMeiPo implements InvocationHandler{

    private Object target;

    public Object getInstance(Object target){
        System.out.println("====enter getInstance");
        //赋值
        this.target = target;
        //处理对象
        Class<?> clazz = target.getClass();
        System.out.println("==========begin proxy");
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    private void before(){
        System.out.println("我是媒婆，给你找对象,拿到你需求，开始给你找对象");
    }

    private void after(){
        System.out.println("如果合适的话，就在一起");
    }

    //被代理对象调用方法的时候才会生效
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        //处理
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }
}
