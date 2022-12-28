package org.sniklz.cinema.dao;

import java.util.Optional;
import org.sniklz.cinema.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(String roleName);
}
