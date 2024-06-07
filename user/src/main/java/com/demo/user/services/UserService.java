package com.demo.user.services;

import java.util.List;

import com.demo.user.models.User;

public interface UserService {
    User getUser(int id);

    List<User> getUser();

    User nuevUser(User user);
}
