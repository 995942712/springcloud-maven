package com.ming.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 客户端负载均衡Config
 */
@Configuration
public class Config {

    @Bean
    @LoadBalanced//客户端负载均衡加上
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}