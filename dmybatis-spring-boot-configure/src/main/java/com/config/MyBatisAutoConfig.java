package com.config;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.context.annotation.Bean;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;

@AutoConfiguration // 表示当前类是一个自动配置类
public class MyBatisAutoConfig {

  // SqlSessionFactoryBean
  @Bean
  public SqlSessionFactoryBean SqlSessionFactoryBean(DataSource dataSource) {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

    sqlSessionFactoryBean.setDataSource(dataSource);

    return sqlSessionFactoryBean;
  }

  // MapperScannerConfigure
  @Bean
  public MapperScannerConfigurer mapperScannerConfigurer(BeanFactory beanFactory) {
    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
    // 扫描的包：启动类所在的包及其子包
    List<String> packages = AutoConfigurationPackages.get(beanFactory);
    String p = packages.get(0);
    mapperScannerConfigurer.setBasePackage(p);

    // 扫描的注解：Mapper.class
    mapperScannerConfigurer.setAnnotationClass(Mapper.class);

    return mapperScannerConfigurer;
  }
}
