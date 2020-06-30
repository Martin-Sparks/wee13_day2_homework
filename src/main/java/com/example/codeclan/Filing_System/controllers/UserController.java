package com.example.codeclan.Filing_System.controllers;

import com.example.codeclan.Filing_System.models.File;
import com.example.codeclan.Filing_System.models.User;
import com.example.codeclan.Filing_System.respositories.FileRepository;
import com.example.codeclan.Filing_System.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value ="/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getUsers(@PathVariable Long id){
        return new ResponseEntity<> (userRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
