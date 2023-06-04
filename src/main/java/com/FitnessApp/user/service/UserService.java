package com.FitnessApp.user.service;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.User;
import com.FitnessApp.user.model.CreateUser;
import com.FitnessApp.user.model.UpdateUser;
import com.FitnessApp.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUser user) {
        return userRepository.insert(user);
    }

    public Optional<User> findUserByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public void updateUser(UUID id, UpdateUser user) {
        userRepository.updateUser(id, user);
    }

    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}

