package com.ming.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
//import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * http://localhost:7111/hystrix
 * http://localhost:7111/hystrix.stream
 */
@EnableEurekaClient
@EnableHystrix//Hystrix断路器
@EnableHystrixDashboard//Hystrix断路器仪表盘
@SpringBootApplication
public class HystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixApplication.class, args);
	}

}