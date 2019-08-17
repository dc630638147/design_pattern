package com.af.decorater.login;

/**
 * Created by Administrator on 2019/8/17.
 */
public interface SigninService {
    ResultMsg regist(String username, String password);
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);

}
