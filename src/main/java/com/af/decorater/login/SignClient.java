package com.af.decorater.login;

/**
 * Created by Administrator on 2019/8/17.
 */
public class SignClient {
    public static void main(String[] args) {
        SigninForThirdServiceImpl s = new SigninForThirdServiceImpl(new SigninServiceImpl());
        s.loginForQQ("xzx");
    }
}
