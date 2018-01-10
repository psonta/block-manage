package com.pson;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.pson")
public class HCMApplication {

    public static void main(String[] args) {
        //uruchomienie Spring Boota
        SpringApplication.run(HCMApplication.class, args);
    }

}
