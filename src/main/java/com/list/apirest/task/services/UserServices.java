package com.list.apirest.task.services;


import com.list.apirest.task.DAO.UserRepository;
import com.list.apirest.task.Entity.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service
public class UserServices {
    private final UserRepository userRepository;

    HashMap<String, Object> info = new HashMap<>();

    @Autowired
    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<users> getUsers(){
        return this.userRepository.findAll();
    }

    public ResponseEntity<Object> deleteUser(int id){
        info = new HashMap<>();
        boolean exist=userRepository.existsById(id);
        if(!exist){
            info.put("Error",true);
            info.put("message","User no found");
            return new ResponseEntity<>(
                    info,
                    HttpStatus.CONFLICT
            );
        }
        info.put("message","The user was successfully deleted");
        return new ResponseEntity<>(
                info,
                HttpStatus.ACCEPTED
        );
    }
}
