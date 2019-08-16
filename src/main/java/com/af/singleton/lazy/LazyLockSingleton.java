package com.af.singleton.lazy;

public class LazyLockSingleton {
    private static LazyLockSingleton lazyLockSingleton = null;

    public static LazyLockSingleton getLazyLockSingleton(){
        if(lazyLockSingleton == null){
            synchronized (LazyLockSingleton.class){
                if(lazyLockSingleton == null){
                    lazyLockSingleton = new LazyLockSingleton();
                }
            }
        }
        return lazyLockSingleton;
    }
}
