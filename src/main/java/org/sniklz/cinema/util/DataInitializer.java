package org.sniklz.cinema.util;
import java.util.Set;
import javax.annotation.PostConstruct;

import org.sniklz.cinema.model.Role;
import org.sniklz.cinema.model.User;
import org.sniklz.cinema.service.RoleService;
import org.sniklz.cinema.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role(Role.RoleName.USER);
        roleService.add(userRole);
        User admin = new User();
        admin.setEmail("admin@mail.com");
        admin.setPassword("admin1234");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);
        User simpleUser = new User();
        simpleUser.setEmail("user@mail.com");
        simpleUser.setPassword("user1234");
        simpleUser.setRoles(Set.of(userRole));
        userService.add(simpleUser);
    }
}
