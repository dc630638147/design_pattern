package com.af.delegate.boss;

/**
 * @ClassName DelegateClent
 * @Description
 * @Author {USER}
 * @Date 2019/8/16 10:44
 * @Version 1.0
 **/
public class DelegateClent {

    public static void main(String[] args) {
        new Boss().command("login",new Leader());
    }
}
