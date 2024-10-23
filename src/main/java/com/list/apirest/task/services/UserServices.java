package com.list.apirest.task.services;


import com.list.apirest.task.DAO.UserRepository;
import com.list.apirest.task.Entity.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    private final UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<users> getUsers(){
        return this.userRepository.findAll();
    }
}
