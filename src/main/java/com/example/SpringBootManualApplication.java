package com.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com")
@SpringBootApplication
public class SpringBootManualApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootManualApplication.class, args);

        String message = context.getBean(String.class);
        System.out.println(message);
    }

    @Bean
    public String injectToIoC() {
        return new String("注入到 IoC 容器");
    }
}
