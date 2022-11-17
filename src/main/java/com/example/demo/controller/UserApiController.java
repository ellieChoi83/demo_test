package com.example.demo.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserApiController {
    @Data
    public class User {

        int id;
        String username;
        String password;
        public User(int id, String username, String password){
            this.id = id;
            this.username=username;
            this.password=password;
        }
    }

    @GetMapping("/api/users")
    public User user(){

        User user = new User(1,"최희정","ma123");

        return user;
    }
}
