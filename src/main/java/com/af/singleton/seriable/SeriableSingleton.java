package com.af.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

    private SeriableSingleton(){
        if(SeriableHolder.lazy !=null){
            throw new RuntimeException("不允许创建重复对象");
        }
    }
    public static SeriableSingleton getSeraleSingleton(){
        return SeriableHolder.lazy;
    }
    private static class SeriableHolder{
        private static SeriableSingleton lazy = new SeriableSingleton();
    }


    //避免反序列化被重新创建对象
    //内部实现:
    //1反序列化的时候，会不会先判断有没有构造方法，如果有，就会new一个对象，
    // 然后判断有没有重写readResolve，r如果有，就使用重写的，没有就使用new的对象
    //2.重写readResolve方法，只不过是覆盖了反序列化出来的对象
    //3.还是创建了两次，发生了在JVM层面，相对来说比较安全
    //4.之前反序列化出来的对象会被GC回收
    private Object readResolve(){
        return SeriableHolder.lazy;
    }
}
