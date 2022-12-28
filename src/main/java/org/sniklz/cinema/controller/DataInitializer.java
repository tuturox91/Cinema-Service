package org.sniklz.cinema.controller;

import java.util.Set;
import org.sniklz.cinema.model.Role;
import org.sniklz.cinema.model.User;
import org.sniklz.cinema.service.RoleService;
import org.sniklz.cinema.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inject")
public class DataInitializer {

    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping
    public void inject() {
        Role adminRole = new Role();
        adminRole.setName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setName(Role.RoleName.USER);
        roleService.add(userRole);
        User user = new User();
        user.setEmail("admin@i.ua");
        user.setPassword("admin123");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
        User user2 = new User();
        user2.setEmail("user@i.ua");
        user2.setPassword("user123");
        user2.setRoles(Set.of(userRole));
        userService.add(user2);
    }
}
