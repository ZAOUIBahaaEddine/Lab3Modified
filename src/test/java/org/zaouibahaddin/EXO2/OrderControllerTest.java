package org.zaouibahaddin.EXO2;

import org.zaouibahaddin.EXO2.Order;
import org.zaouibahaddin.EXO2.OrderController;
import org.zaouibahaddin.EXO2.OrderDAO;
import org.zaouibahaddin.EXO2.OrderService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class OrderControllerTest {

    @Test
    public void testCreateOrder() {


        OrderService mockOrderService = mock(OrderService.class);

        OrderController orderController = new OrderController(mockOrderService);

        Order order = new Order();

        orderController.createOrder(order);

        verify(mockOrderService).createOrder(order);



        OrderDAO mockOrderDao = mock(OrderDAO.class);

        OrderService orderService = new OrderService(mockOrderDao);

        orderService.createOrder(order);

        verify(mockOrderDao).saveOrder(order);
    }
}