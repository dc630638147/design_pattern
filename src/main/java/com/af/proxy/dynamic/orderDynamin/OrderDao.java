package com.af.proxy.dynamic.orderDynamin;


import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author {USER}
 * @Date 2019/8/15 14:03
 * @Version 1.0
 **/
public class OrderDao {

    public int insertOrder(Order order){
        System.out.println("保存order成功");
        return 1;
    }
}
