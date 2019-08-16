package com.af.singleton.seriable;

import com.af.singleton.utils.ConcurrentExecutor;

/**
 * Created by Administrator on 2019/8/14.
 */
public class ContainerTest {
    public static void main(String[] args) throws Exception {


        ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
            public void handler() {
                Object object = ContainerSingleton.getObject("com.af.singleton.seriable.Pojo");
                System.out.println(object);
            }
        },10,6);
        //执行10次，开启6个线程
    }
}
