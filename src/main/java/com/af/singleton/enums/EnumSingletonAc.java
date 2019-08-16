package com.af.singleton.enums;/**
 * Created by ywwl on 2019/8/15.
 */

/**
 * @ClassName EnumSingletonAc
 * @Description TODO
 * @Author {USER}
 * @Date 2019/8/15 10:19
 * @Version 1.0
 **/
public enum  EnumSingletonAc {
    INSTANCE;

    private Pojo pojo;
    EnumSingletonAc(){
        pojo = new Pojo();
    }

    public Pojo getPojo(){
        return pojo;
    }

}
