package com.af.adapter.loginOne;

/**
 * Created by Administrator on 2019/8/16.
 */
public class SignClient {

    public static void main(String[] args) {
        SignForThirdService signForThirdService = new SignForThirdService();

        //不改变原来的代码，也要兼容新的需求，
        //还可以在加一层策略模式
        signForThirdService.loginForQQ("xxxxxx");
    }
}
