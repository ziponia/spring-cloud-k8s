package com.example.display;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DisplayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisplayApplication.class);
    }
}
