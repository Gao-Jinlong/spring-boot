package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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
    return new String("CommonConfig 注入 String 到 IoC 容器");
  }

  // 条件注入，当配置文件中包含 country.name 和 country.system 时才会注入 Country
  @ConditionalOnProperty(prefix = "country", name = { "name", "system" })
  @Bean
  // 通过 @Value 注入配置文件中的值
  public Country country(@Value("${country.name}") String name, @Value("${country.system}") String system) {
    Country country = new Country();
    country.setName(name);
    country.setSystem(system);
    return country;
  };

  // 如果 IoC 中不存在 Country 则注入 Province, 否则不注入
  // @ConditionalOnMissingBean(Country.class)
  // @Bean
  // public Province province() {
  // Province province = new Province();
  // province.setName("shanghai");
  // return province;
  // }

  // 如果当前环境中存在 DispatcherServlet 类，则注入 Province，否则不注入
  @ConditionalOnClass(name = "org.springframework.web.servlet.DispatcherServlet")
  @Bean
  public Province province() {
    Province province = new Province();
    province.setName("shandong");
    return province;
  }
}
