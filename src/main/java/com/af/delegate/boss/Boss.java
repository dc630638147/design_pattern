package com.af.delegate.boss;


/**
 * boss下发任务
 * 委派模式
 */
public class Boss {
    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
