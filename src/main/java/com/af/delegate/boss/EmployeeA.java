package com.af.delegate.boss;/**
 * Created by ywwl on 2019/8/16.
 */

/**
 * @ClassName EmployeeA
 * @Description TODO
 * @Author {USER}
 * @Date 2019/8/16 10:10
 * @Version 1.0
 **/
public class EmployeeA implements Employee {
    public void doing(String command) {
        System.out.println("我是员工A，现在开始干:"+command+"工作");
    }
}
