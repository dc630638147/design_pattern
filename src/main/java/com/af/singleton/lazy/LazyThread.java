package com.af.singleton.lazy;
/**
 * @ClassName LazyThread
 * @Description TODO
 * @Author {USER}
 * @Date 2019/8/14 14:21
 * @Version 1.0
 **/
public class LazyThread implements Runnable {
    public void run() {
        LazyLockSingleton lazyLockSingleton = LazyLockSingleton.getLazyLockSingleton();
        System.out.println("地址值:"+lazyLockSingleton);
    }
}
