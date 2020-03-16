package com.longxinwu.bootlaunch.controller;

import com.longxinwu.bootlaunch.domain.User;
import com.longxinwu.bootlaunch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepo;
    @RequestMapping("/saveUser")
    public String saveData() throws ParseException {
        userRepo.save(new User("Hello"));
        userRepo.save(new User("New"));
        userRepo.save(new User("Year"));
        return "successful";
    }
    @RequestMapping("getUser")
    public String getData(){
        User user = userRepo.getOne(1L);
        return user.getName();
    }
}
