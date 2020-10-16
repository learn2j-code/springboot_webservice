package com.how2java.smh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={"com.how2java.smh"}) 
@MapperScan(basePackages="com.how2java.smh.mapper")
public class Application {
 
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
 
}