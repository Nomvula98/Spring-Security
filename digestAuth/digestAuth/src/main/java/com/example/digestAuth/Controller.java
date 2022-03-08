package com.example.digestAuth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class Controller {
    List userList = new ArrayList();

    @PostMapping
    public String registerUser(@RequestBody User user){
        userList.add(user);
        return "Successfully registered user";
    }
}
