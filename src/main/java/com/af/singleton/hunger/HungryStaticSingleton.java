package com.af.singleton.hunger;
/**
 * @ClassName HungryStaticSingleton
 * @Description
 * @Author
 * @Date 2019/8/14 13:41
 * @Version 1.0
 **/
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}
    public static HungryStaticSingleton getInstance(){
        return  hungrySingleton;
    }
}
