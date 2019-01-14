package com.ming.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDER")//创建Ribbon负载均衡器
public interface FeignService {

    @GetMapping(value = "/home")
    String hello();

}