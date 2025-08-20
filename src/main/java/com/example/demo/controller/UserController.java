package com.example.demo.controller; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
     
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/create")
    public String createUser() {
        return "utilisateur créé avec succès : " ;
    }
   
    
}
