package com.qigang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.qigang.repository")
@EntityScan(basePackages = "com.qigang")
public class App 
{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
