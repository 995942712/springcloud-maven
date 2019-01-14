package com.ming.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @ResponseBody
    @RequestMapping("/home")
    public String home() {
        return "hello world, port: " + port;
    }

    @ResponseBody
    @GetMapping(value = "/ribbon")
    public String hello() {
        return restTemplate.getForObject("http://PROVIDER/home", String.class);
    }

}