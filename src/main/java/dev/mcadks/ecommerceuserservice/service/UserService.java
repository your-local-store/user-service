package dev.mcadks.ecommerceuserservice.service;

import dev.mcadks.ecommerceuserservice.entity.User;
import dev.mcadks.ecommerceuserservice.entity.UserEntity;
import dev.mcadks.ecommerceuserservice.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<User> getUser(final BigInteger userId) {
        Optional<User> fetchedUser = Optional.ofNullable(this.userRepository.findById(userId).block());

        fetchedUser.ifPresent(user -> {
            if(user.getPassword() != null) {
                user.setPassword(null);
            }
        });

        return fetchedUser.map(Mono::just).orElseGet(Mono::empty);
    }

    public Mono<User> addUser(final UserEntity user) {
        Optional<User> addedUser = Optional.ofNullable(this.userRepository.insert(user).block());

        return addedUser.map(Mono::just).orElseGet(Mono::empty);
    }
}