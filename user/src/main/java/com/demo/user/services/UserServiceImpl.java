package com.demo.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.user.models.User;
import com.demo.user.repositories.FakeUserRepositoryImpl;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private FakeUserRepositoryImpl userRepository;

    @Override
    public User getUser(int id) {
        return userRepository.getUser(id);
    }

    @Override
    public List<User> getUser() {
        return userRepository.getUser();
    }

    @Override
    public User nuevUser(User user) {
        return userRepository.nuevUser(user);
    }

}
