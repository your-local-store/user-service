package dev.mcadks.ecommerceuserservice.repository;

import dev.mcadks.ecommerceuserservice.entity.User;
import dev.mcadks.ecommerceuserservice.entity.UserEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@Repository
public interface UserRepository extends ReactiveMongoRepository<UserEntity, BigInteger> {
    Mono<User> getByUsername(String username);
}
