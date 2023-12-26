package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
  @Value("${email.user[0]}")
  private String user;

  @Value("${email.code}")
  private String code;

  // @Value("${email.host}")
  // private String host;

  // @Value("${email.auth}")
  // private boolean auth;

  @RequestMapping("/hello")
  public String hello() {
    return "Hello Spring Boot!" + user + " " + code;
  }
}
