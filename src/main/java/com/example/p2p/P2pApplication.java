package com.example.p2p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.example.p2p.controller")
public class P2pApplication {

    public static void main(String[] args) {
        SpringApplication.run(P2pApplication.class, args);
    }

}
