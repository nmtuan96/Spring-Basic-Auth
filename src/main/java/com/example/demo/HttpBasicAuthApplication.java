package com.example.demo;

import com.example.demo.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class HttpBasicAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpBasicAuthApplication.class, args);
    }

}
