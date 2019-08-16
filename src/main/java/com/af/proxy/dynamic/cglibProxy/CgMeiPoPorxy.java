package com.af.proxy.dynamic.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName CgMeiPoPorxy
 * @Description TODO
 * @Author {USER}
 * @Date 2019/8/15 15:03
 * @Version 1.0
 **/
public class CgMeiPoPorxy implements MethodInterceptor {


    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();

        //设置
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }



    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
        after();
        return obj;
    }
    private void before(){
        System.out.println("before");
    }

    private void after(){
        System.out.println("after");
    }
}
