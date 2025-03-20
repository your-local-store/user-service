package dev.mcadks.ecommerceuserservice.controller;

import dev.mcadks.ecommerceuserservice.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


}
