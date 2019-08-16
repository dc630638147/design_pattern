package com.af.adapter.loginOne;

/**
 * Created by Administrator on 2019/8/16.
 * 通过集成原来的业务，实现接口扩展
 */
public class SignForThirdService extends SignService {

    public ResultMsg loginForQQ(String openId) {
        //1、openId 是全局唯一，我们可以把它当做是一个用户名(加长)
        // 2、密码默认为 QQ_EMPTY //3、注册（在原有系统里面创建一个用户）
        //4、调用原来的登录方法
        return loginForRegist(openId, null);
    }


    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    public ResultMsg loginForToken(String token) {
        //通过 token 拿到用户信息，然后再重新登陆了一次
        return null;
    }
    public ResultMsg loginForTelphone (String telphone, String code){
        return null;
    }

    /**
     * 第三方登录，最终还是调用接口
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg loginForRegist(String username, String password) {
        super.regist(username, null);
        return super.login(username, null);
    }

}
