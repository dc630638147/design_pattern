package com.af.decorater.login;

/**
 * Created by Administrator on 2019/8/17.
 */
public interface SigninForThirdServie extends SigninService {
    /**
     * QQ 登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);
    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);
    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);
    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);
    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
    咕泡出品，必属精品 www.gupaoedu.com
    12
     */
    ResultMsg loginForRegist(String username,String passport);
}
