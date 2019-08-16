package com.af.singleton.lazy;/**
 * Created by ywwl on 2019/8/14.
 */

/**
 * @ClassName LazyTest
 * @Description TODO
 * @Author {USER}
 * @Date 2019/8/14 14:21
 * @Version 1.0
 **/
public class LazyTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new LazyThread());
        Thread t2 = new Thread(new LazyThread());
        t1.start();
        t2.start();
        System.out.println("======over===========");
    }
}
