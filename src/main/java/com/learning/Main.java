package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.learning"})
//@EnableJdbcRepositories(basePackages = {"com.learning"})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
