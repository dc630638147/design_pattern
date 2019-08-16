package com.af.proxy.dynamic.orderDynamin;


import java.util.Date;

/**
 * @ClassName OrderClient
 * @Description TODO
 * @Author {USER}
 * @Date 2019/8/15 14:36
 * @Version 1.0
 **/
public class OrderClient {

    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(new Date().getTime());
        //执行代理请求
        OrderService orderService = (OrderService) new OrderServiceDynaminProxy().getInstance(new OrderServiceImpl());
         //执行方法，调用动态代理ideinvoke方法
        orderService.createOrder(order);
    }
}
