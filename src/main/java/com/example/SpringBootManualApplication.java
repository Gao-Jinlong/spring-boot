package com.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com")
@SpringBootApplication
public class SpringBootManualApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootManualApplication.class, args);
    }
}
