package org.sniklz.cinema.service;

import java.util.Optional;
import org.sniklz.cinema.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
