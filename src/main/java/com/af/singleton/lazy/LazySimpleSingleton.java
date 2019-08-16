package com.af.singleton.lazy;


//单例，针对方法加锁，因为静态方法上锁会连对象一起锁上，影响了性能，不建议。
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton(){}

    public static synchronized LazySimpleSingleton getSingleton(){
        if(lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }

}
