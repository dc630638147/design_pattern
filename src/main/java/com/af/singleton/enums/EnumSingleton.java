package com.af.singleton.enums;


/**
 * 枚举单例
 */
public enum EnumSingleton {
    SINGLETON;

    private String data;

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }

    public static EnumSingleton getSingleton(){
        return SINGLETON;
    }
}
