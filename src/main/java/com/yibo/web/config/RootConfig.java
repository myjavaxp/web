package com.yibo.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan(value = "com.yibo.web", excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, value = {Controller.class, RestController.class}),
        @Filter(type = FilterType.ASSIGNABLE_TYPE, value = ServletConfig.class)
})
@EnableTransactionManagement
public class RootConfig {
}