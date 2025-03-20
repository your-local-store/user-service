package dev.mcadks.ecommerceuserservice.repository;

import dev.mcadks.ecommerceuserservice.entity.UserEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<UserEntity, String> {
}
