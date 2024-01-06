package com.beanScan;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BeanScan {
  // spring boot 默认扫描的包是启动类所在的包及其子包
  // 如果启动类不在顶层包，需要手动指定扫描的包
  // 通过@ComponentScan注解指定扫描的包
  // @ComponentScan(basePackages = "com")

  @RequestMapping("/beanScan")
  public String beanScan() {
    return new String("扫描 beanScan 包下的类");
  }

}
