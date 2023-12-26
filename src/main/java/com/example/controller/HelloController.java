package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RestController
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "email")
public class HelloController {
  // @Value("${email.user[0]}")
  private List<String> user;

  // @Value("${email.code}")
  private String code;

  // @Value("${email.host}")
  private String host;

  // @Value("${email.auth}")
  private boolean auth;

  @RequestMapping("/hello")
  public String hello() {
    return "Hello Spring Boot!" + user + " " + code;
  }

  public List<String> getUser() {
    return user;
  }

  public void setUser(List<String> user) {
    this.user = user;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

}
