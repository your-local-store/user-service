package dev.mcadks.ecommerceuserservice.controller;

import dev.mcadks.ecommerceuserservice.entity.User;
import dev.mcadks.ecommerceuserservice.entity.UserEntity;
import dev.mcadks.ecommerceuserservice.service.UserService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @QueryMapping
    public Mono<User> getUser(@Argument BigInteger id) {
        return this.userService.getUser(id);
    }

    @MutationMapping
    public Mono<User> addUser(@Argument UserEntity user) {
        return this.userService.addUser(user);
    }

}
