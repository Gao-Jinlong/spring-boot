package com.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.config.CommonConfig;
import com.config.CommonImportSelector;
import com.config.Country;
import com.config.Province;
import com.example.annotation.EnableCommonConfig;
import com.example.service.impl.UserServiceImpl;

// @ComponentScan(basePackages = "com") // 手动设置扫描的路径
// @Import(CommonConfig.class) // 手动注册类到 IoC
// @Import(CommonImportSelector.class) // 使用 ImportSelector 手动注册类到 IoC
@EnableCommonConfig // 使用自定义组合注解
@SpringBootApplication // sporingboot 的starter依赖中也是使用相同的方式完成的自动注入，具体注解为
                       // @EnableAutoConfiguration，@SpringBootApplication
                       // sporingboot的starter依赖中也是使用相同的方式完成的自动注入，具体注解为
                       // @EnableAutoConfiguration，AutoConfigurationImportSelector
                       // spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports 配置文件

public class SpringBootManualApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootManualApplication.class, args);

        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        System.out.println(userService.toIoC());

        String str = context.getBean("IoCString", String.class);
        System.out.println(str);

        // Country country = context.getBean(Country.class);
        // System.out.println(country.getName() + " " + country.getSystem());

        Province province = context.getBean(Province.class);
        System.out.println(province.getName());
    }

}
