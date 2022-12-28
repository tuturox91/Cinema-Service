package org.sniklz.cinema.dao;

import org.sniklz.cinema.model.ShoppingCart;
import org.sniklz.cinema.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
