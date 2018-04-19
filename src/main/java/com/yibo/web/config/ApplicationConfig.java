package com.yibo.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.yibo.web"})
@EnableTransactionManagement
@PropertySource("classpath:jdbc.properties")
public class ApplicationConfig {
}