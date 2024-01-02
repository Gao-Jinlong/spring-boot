package com.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.service.impl.UserServiceImpl;

@ComponentScan(basePackages = "com")
@SpringBootApplication
public class SpringBootManualApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootManualApplication.class, args);

        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        System.out.println(userService.toIoC());

        String str = context.getBean("IoCString", String.class);
        System.out.println(str);
    }

}
