package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component // 用于将类标识为Bean，只有标识为Bean的类才能被Spring容器所管理，从而使得其中的属性可以注入
@RestController
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

  public void setUser(List<String> user) { // 注意：这里的set方法必须要有，否则无法注入，因为SpringBoot是通过set方法注入的
    this.user = user;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

}
