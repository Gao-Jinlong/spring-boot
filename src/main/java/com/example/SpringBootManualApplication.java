package com.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.config.CommonConfig;
import com.config.CommonImportSelector;
import com.example.service.impl.UserServiceImpl;

// @ComponentScan(basePackages = "com") // 手动设置扫描的路径
// @Import(CommonConfig.class) // 手动注册类到 IoC
@Import(CommonImportSelector.class) // 使用 ImportSelector 手动注册类到 IoC
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
