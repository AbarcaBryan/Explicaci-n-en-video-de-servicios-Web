package com.demo.user.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.user.models.User;
import com.demo.user.services.UserService;
import com.demo.user.utils.UserException;

import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUser() {
        return userService.getUser();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) {
        User user = userService.getUser(id);
        if (user == null) {
            throw new UserException("No se ha encontrado el usuario con el " + id);
        }

        return ResponseEntity.ok(user);
    }

    // 201 found
    @PostMapping("/user")
    public ResponseEntity<User> nuevUser(@RequestBody User user) {
        var new_user = userService.nuevUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(new_user);
    }
}