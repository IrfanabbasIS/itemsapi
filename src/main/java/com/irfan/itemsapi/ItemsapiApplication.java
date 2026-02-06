package com.irfan.itemsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.irfan.itemsapi")
public class ItemsapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemsapiApplication.class, args);
    }
}
