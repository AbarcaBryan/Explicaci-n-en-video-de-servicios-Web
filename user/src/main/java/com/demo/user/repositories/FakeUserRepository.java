package com.demo.user.repositories;

import java.util.List;

import com.demo.user.models.User;

public interface FakeUserRepository {
    User getUser(int id);

    List<User> getUser();

    User nuevUser(User user);
}
