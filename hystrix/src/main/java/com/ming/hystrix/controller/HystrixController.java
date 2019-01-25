package com.ming.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class HystrixController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getHystrix")
    @ResponseBody
    @GetMapping(value = "/hystrix1")
    public String hello() {
        return restTemplate.getForObject("http://PROVIDER/home", String.class);
    }

    public String getHystrix(){
        return "hello, 服务挂了";
    }

}