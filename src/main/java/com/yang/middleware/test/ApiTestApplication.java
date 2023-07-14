package com.yang.middleware.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/14
 * @Copyright：
 */
@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.yang.middleware"})
public class ApiTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class,args);
    }
}
