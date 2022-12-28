package org.sniklz.cinema.service;

import org.sniklz.cinema.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
