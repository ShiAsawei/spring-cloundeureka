package com.learn.conytoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List getUser(){

        return restTemplate.getForObject("http://localhost:8081",List.class);
    }
}
