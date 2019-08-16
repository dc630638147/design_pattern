package com.af.delegate.boss;

/**
 * 员工B
 */
public class EmployeeB implements Employee {
    public void doing(String command) {
        System.out.println("我是员工B，现在开始干:"+command+"工作");
    }
}
