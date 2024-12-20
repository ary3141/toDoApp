package com.example.toDoApp.service;

import com.example.toDoApp.entity.User;
import com.example.toDoApp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findUserById(Long userId) {
        return userRepository.findById(userId);
    }

    public User updateProfile(User user) {
        return userRepository.save(user);
    }
}
