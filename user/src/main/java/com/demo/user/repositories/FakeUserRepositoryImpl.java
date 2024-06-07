package com.demo.user.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.user.models.User;

@Repository
public class FakeUserRepositoryImpl implements FakeUserRepository {
    private List<User> users = new ArrayList<>();

    public FakeUserRepositoryImpl() {
        users.add(new User(1, "Hillary Bustamante", "Busta_Hillary02"));
        users.add(new User(2, "María López", "M_Lopez34"));
        users.add(new User(3, "Pedro Sánchez", "PSanchez01"));
        users.add(new User(4, "Sofía Rodríguez", "Sofia_Rdz07"));
    }

    public User getUser(int id) {
        System.out.println("Conectando a base de datos ORACLE");
        for (User user : users) {
            if (id == user.getId())
                return user;

        }

        return null;
    }

    public List<User> getUser() {
        System.out.println("Conectando a base de datos ORACLE");
        return users;
    }

    @Override
    public User nuevUser(User user) {
        users.add(user);
        return user;
    }

}
