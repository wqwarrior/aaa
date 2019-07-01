package com.jumpin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jumpin.dao")
public class AppMain {
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class,args);
    }
}