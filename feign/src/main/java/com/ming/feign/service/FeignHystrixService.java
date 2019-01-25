package com.ming.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PROVIDER", fallback = FeignHystrixServiceImpl.class)
public interface FeignHystrixService {

    @GetMapping(value = "/home")
    String hello();

}