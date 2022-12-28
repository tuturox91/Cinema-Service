package org.sniklz.cinema.dao;

import java.util.List;
import org.sniklz.cinema.model.Order;
import org.sniklz.cinema.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
