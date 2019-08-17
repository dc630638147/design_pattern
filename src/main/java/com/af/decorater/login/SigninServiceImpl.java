package com.af.decorater.login;

import com.af.adapter.loginOne.Member;

/**
 * Created by Administrator on 2019/8/17.
 */
public class SigninServiceImpl implements SigninService {
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200,"注册成功",new Member());
    }

    public ResultMsg login(String username, String password) {
        return null;
    }
}
