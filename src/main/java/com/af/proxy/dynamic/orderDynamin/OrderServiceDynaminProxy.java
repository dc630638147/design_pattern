package com.af.proxy.dynamic.orderDynamin;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName OrderServiceDynaminProxy
 * @Description TODO
 * @Author {USER}
 * @Date 2019/8/15 14:14
 * @Version 1.0
 **/
public class OrderServiceDynaminProxy implements InvocationHandler{

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before(Object target){
        System.out.println("proxy method before");
        try{
            //Object getCreateTime = (Long)target.getClass().getMethod("getCreateTime").invoke(target);
            Long createTime = (Long)target.getClass().getMethod("getCreateTime").invoke(target);
            SimpleDateFormat format = new SimpleDateFormat("yyyy");
            Integer year = Integer.valueOf(format.format(new Date(createTime)));
            System.out.println("动态代理分配到："+year+"数据库");
            DynamicDataSourceEntity.set(year);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void after(){
        System.out.println("proxy method after");
    }
}
