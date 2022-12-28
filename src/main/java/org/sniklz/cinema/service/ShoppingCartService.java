package org.sniklz.cinema.service;

import org.sniklz.cinema.model.MovieSession;
import org.sniklz.cinema.model.ShoppingCart;
import org.sniklz.cinema.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
