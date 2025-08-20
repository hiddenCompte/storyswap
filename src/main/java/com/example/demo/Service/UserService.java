package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Model.User;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User createUser (User user){ return userRepo.save(user);}
    public User deleteUser (User user){ 
        userRepo.delete(user);
        return user;
    }
    public User updateUser (User user){ return userRepo.save(user);}
    public User getUserById (int id){ return userRepo.findById(id).orElse(null); }
    public Iterable<User> getAllUsers (){ return userRepo.findAll(); }

    
}
