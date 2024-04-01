package com.example.onlineshopdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineShopDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineShopDiscoveryApplication.class, args);
    }

}
