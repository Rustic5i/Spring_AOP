package com.baratov.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.baratov.spring.aop")
@EnableAspectJAutoProxy //Позволяет нам за кулисами использовать Spring AOP Proxy
public class Config {
}
