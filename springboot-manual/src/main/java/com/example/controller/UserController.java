package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.User;
import com.example.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping("/findById")
  public User findById(@RequestParam Integer id) {
    return userService.findById(id);
  }

}
