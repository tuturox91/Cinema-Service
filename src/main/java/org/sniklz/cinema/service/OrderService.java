package org.sniklz.cinema.service;

import java.util.List;
import org.sniklz.cinema.model.Order;
import org.sniklz.cinema.model.ShoppingCart;
import org.sniklz.cinema.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
