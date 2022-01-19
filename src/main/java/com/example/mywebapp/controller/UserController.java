package com.example.mywebapp.controller;

import com.example.mywebapp.model.User;
import com.example.mywebapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/users")
    public String showUsersList(Model model){
        List<User> listUsers =service.listAll();
        model.addAttribute("listUsers",listUsers);
        return "users";
    }

    @GetMapping("/users/new")
    public String showNewForm(Model model){
        model.addAttribute("user",new User());
        return "user_form";
    }


}
