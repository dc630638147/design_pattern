package com.af.proxy.dynamic.cglibProxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @ClassName CgCustomerClient
 * @Description TODO
 * @Author {USER}
 * @Date 2019/8/15 15:13
 * @Version 1.0
 **/
public class CgCustomerClient {

    public static void main(String[] args) {

        //debug打印反编译的信息,写入的是custonmer类的信息
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://cglib_proxy_classes");


        //cglib的被代理对象不需要实现接口
        CgCustomer customer =(CgCustomer) new CgMeiPoPorxy().getInstance(new CgCustomer().getClass());
        System.out.println(customer);
        customer.findNewLove();
    }
}
