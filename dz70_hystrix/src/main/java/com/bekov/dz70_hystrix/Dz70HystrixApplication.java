package com.bekov.dz70_hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
@EnableEurekaClient
public class Dz70HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dz70HystrixApplication.class, args);
    }

}
