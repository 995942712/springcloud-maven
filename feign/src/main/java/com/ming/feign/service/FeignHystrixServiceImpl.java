package com.ming.feign.service;

import org.springframework.stereotype.Component;

@Component
public class FeignHystrixServiceImpl implements FeignHystrixService {

    @Override
    public String hello() {
        return "Feign-Hystrix服务挂了";
    }

}