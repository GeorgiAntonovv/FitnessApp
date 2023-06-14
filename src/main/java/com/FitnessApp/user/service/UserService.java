package com.FitnessApp.user.service;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.User;
import com.FitnessApp.user.model.CreateUser;
import com.FitnessApp.user.model.UpdateProfile;
import com.FitnessApp.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UUID createUser(CreateUser user) {
        return userRepository.insert(user);
    }

    public Optional<User> findUserByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public User findUserByUserId(UUID userId) {
        return userRepository.findByUserId(userId).orElse(null);
    }

    public void updateUpdateProfile(UUID id, UpdateProfile user) {
        userRepository.updateProfile(id, user);
    }

}

