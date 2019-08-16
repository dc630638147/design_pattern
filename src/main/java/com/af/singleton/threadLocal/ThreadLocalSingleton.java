package com.af.singleton.threadLocal;

/**
 * Created by Administrator on 2019/8/14.
 * 线程与线程之间不一样，在线程内部实现安全
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> tl = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getSingleton(){
        return tl.get();
    }

}
