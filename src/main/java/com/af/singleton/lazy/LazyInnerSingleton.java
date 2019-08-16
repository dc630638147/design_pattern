package com.af.singleton.lazy;

//通过匿名内部类
//这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
//完美地屏蔽了这两个缺点
//史上最牛B的单例模式的实现方式
public class LazyInnerSingleton {


    private LazyInnerSingleton(){
        //避免反射攻击
        if(LazyHolder.lazy != null){
            throw new RuntimeException("不允许创建重复对象");
        }
    }

    public static LazyInnerSingleton  getSingleton(){
        return LazyHolder.lazy;
    }

    private static class LazyHolder{
        private static final  LazyInnerSingleton lazy = new LazyInnerSingleton();
    }

}
