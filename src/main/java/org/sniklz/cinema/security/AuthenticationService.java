package org.sniklz.cinema.security;

import org.sniklz.cinema.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
