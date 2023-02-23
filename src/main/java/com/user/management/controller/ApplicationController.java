package com.user.management.controller;

import com.user.management.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class ApplicationController {

    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity<>(userService, HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable String id) {
        return ResponseEntity<>(userService, HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity<>(userService, HttpStatus.OK);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User user){
        return ResponseEntity<>(userService, HttpStatus.OK);
    }

    @DeleteMapping("/user/id")
    public ResponseEntity<String> deleteUser(@PathVariable String id){
        return ResponseEntity<>(userService, HttpStatus.OK);
    }
}
