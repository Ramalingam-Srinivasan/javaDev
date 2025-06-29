package com.spring.user.service;

import com.spring.user.model.User;
import com.spring.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class UserService {

    @Autowired(required=true)
    private UserRepo userRepo;


    public User getUser(Integer id) {
        try{
            return userRepo.findById(id).get();
        }catch (Exception e){
            return new User();
        }
    }


    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User addUser(User user) {
        return userRepo.save(user);
    }
}
