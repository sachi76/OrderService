package services;

import models.Order;
import repositories.OrderRepository;

import java.util.List;

public interface OrderService {

    Order createOrder(Order order);
    Order updateOrder(Order order);
    void deleteOrder(int orderId);
    Order getOrder(int orderId);
    List<Order> getAllOrders();
    List<Order> getOrdersByCustomer(int customerId);


}
