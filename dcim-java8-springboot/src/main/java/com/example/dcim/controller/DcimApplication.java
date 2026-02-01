package com.example.dcim.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.controller", "com.example.dcim"})
public class DcimApplication {

    public static void main(String[] args) {
        SpringApplication.run(DcimApplication.class, args);
    }
}
