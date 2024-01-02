package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.impl.UserServiceImpl;

@Configuration
public class CommonConfig {

  // @Bean
  // public UserServiceImpl injectUserService() {
  // return new UserServiceImpl();
  // }

  // 注入对象默认名字是方法名
  @Bean(name = "IoCString")
  public String injectString() {
    return new String("注入 String 到 IoC 容器");
  }
}
