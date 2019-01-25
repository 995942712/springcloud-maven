package com.ming.feign.controller;

import com.ming.feign.service.FeignHystrixService;
import com.ming.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeignController {

    @Autowired
    private FeignService feignService;
    @Autowired
    private FeignHystrixService feignHystrixService;

    @ResponseBody
    @GetMapping(value = "/feign")
    public String hello() {
        return this.feignService.hello();
    }

    @ResponseBody
    @GetMapping(value = "/feignHystrim")
    public String feignHystrim() {
        return this.feignHystrixService.hello();
    }

}