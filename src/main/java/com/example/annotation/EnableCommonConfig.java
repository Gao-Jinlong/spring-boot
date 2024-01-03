package com.example.annotation;

import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import com.config.CommonImportSelector;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 自定义组合注解
@Target(ElementType.TYPE) // 作用于类上
@Retention(RetentionPolicy.RUNTIME) // 运行时保留
@Import(CommonImportSelector.class) // 使用 ImportSelector 手动注册类到 IoC
public @interface EnableCommonConfig {
}
