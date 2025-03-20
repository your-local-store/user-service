package dev.mcadks.ecommerceuserservice.service;

import dev.mcadks.ecommerceuserservice.entity.User;
import dev.mcadks.ecommerceuserservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(final String userId) {
        User fetchedUser = this.userRepository.findById(userId).block();

        /*
        * Important
        * Setting password to null
        * */
        fetchedUser.setPassword(null);

        return fetchedUser;
    }
}
