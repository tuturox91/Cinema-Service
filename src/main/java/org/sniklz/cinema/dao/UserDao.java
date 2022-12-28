package org.sniklz.cinema.dao;

import java.util.Optional;
import org.sniklz.cinema.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long id);

    Optional<User> findByEmail(String email);
}
