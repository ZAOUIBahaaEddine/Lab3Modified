package org.zaouibahaddin.EXO2;

public class OrderService {

    private final OrderDAO orderDao;

    public OrderService(OrderDAO orderDao) {
        this.orderDao = orderDao;
    }

    public void createOrder(Order order) {



        orderDao.saveOrder(order);
    }
}