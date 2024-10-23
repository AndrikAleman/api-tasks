package com.list.apirest.task.controllers;


import com.list.apirest.task.Entity.users;
import com.list.apirest.task.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UserServices userServices;

    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping
    public List<users> getAllUsers() {
        return userServices.getUsers();
    }

    @DeleteMapping(path = "{userId}")
    public ResponseEntity<Object> deleteUser(@PathVariable("userId") int userId) {
        return this.userServices.deleteUser(userId);
    }

}
