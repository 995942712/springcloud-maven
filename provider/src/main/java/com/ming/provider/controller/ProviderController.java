package com.ming.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 生产者Controller
 */
@Controller
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @ResponseBody
    @RequestMapping("/home")
    public String home() {
        return "hello world, port: " + port;
    }

    @ResponseBody
    @RequestMapping(value = "/provider", method = RequestMethod.GET)
    public String provider(){
        return "hello, provider";
    }

}