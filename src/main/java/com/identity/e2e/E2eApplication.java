package com.identity.e2e;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class E2eApplication {

    public static void main(String[] args) {
        SpringApplication.run(E2eApplication.class, args);
    }
}
