package com.bekov.dz70_hystrix.controller;

import com.bekov.dz70_hystrix.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HystrixController {

    @GetMapping("/users")
    @HystrixCommand(fallbackMethod = "otherMethod")
    public String getUsers(){
        List<User> user = new ArrayList<>();
        return new RestTemplate().getForObject("http://localhost:9090/names",user.getClass()).toString();

    }


    public String otherMethod(){
        return "система не отвечает";

    }
}
