package com.af.proxy.dynamic.orderDynamin;
/**
 * @ClassName OrderServiceImpl
 * @Description
 * @Author {USER}
 * @Date 2019/8/15 14:07
 * @Version 1.0
 **/
public class OrderServiceImpl implements  OrderService {

    private OrderDao orderDao;

    public OrderServiceImpl(){
        orderDao = new OrderDao();
    }

    public void createOrder(Order order) {
        orderDao.insertOrder(order);
    }
}
