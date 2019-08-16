package com.af.proxy.dynamic.jdk;

/**
 * @ClassName JdkProxyClient
 * @Description TODO
 * @Author {USER}
 * @Date 2019/8/15 11:33
 * @Version 1.0
 **/
public class JdkProxyClient {

    public static void main(String[] args) {
        //jdk动态代理，被代理对象需要实现接口
        Persion person = (Persion) new JdkMeiPo().getInstance(new Customer());
        person.findLove();
    }
}
