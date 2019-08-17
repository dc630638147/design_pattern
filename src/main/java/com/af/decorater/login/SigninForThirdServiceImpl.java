package com.af.decorater.login;

/**
 * Created by Administrator on 2019/8/17.
 */
public class SigninForThirdServiceImpl implements SigninForThirdServie {

    private SigninService signinService;

    public SigninForThirdServiceImpl(SigninService signinService){
        this.signinService = signinService;
    }

    public ResultMsg regist(String username, String password) {
        return signinService.regist(username,password);
    }

    public ResultMsg login(String username, String password) {
        return signinService.login(username,password);
    }

    public ResultMsg loginForQQ(String id) {
        return null;
    }

    public ResultMsg loginForWechat(String id) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        return null;
    }

    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }
}
