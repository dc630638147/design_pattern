package com.af.adapter.loginOne;

/**
 * Created by Administrator on 2019/8/16.
 */
public class SignService {
    /**
     * 注 册 方 法 * @param username * @param password * @return
     */
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    /**
     * 登 录 的 方 法 * @param username * @param password * @return
     */
    public ResultMsg login(String username, String password) {
        return null;
    }
}
