package com.ming.consumer.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * 消费者Controller
 */
@Controller
public class ConsumerController {

    @Autowired
    private EurekaClient eurekaClient;
    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @ResponseBody
    @RequestMapping("/home")
    public String home() {
        return "Hello world ,port:" + port;
    }

    @ResponseBody
    @RequestMapping(value = "/consumer", method = RequestMethod.GET)
    public String consumer(){
        return "hello,consumer";
    }

    /**
     * 调用生产者
     * @return
     */
    @ResponseBody
    @RequestMapping("/consumer2")
    public String getServant(){
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("SERVANT", false);
        String homeHost = instanceInfo.getHomePageUrl();
        System.out.println(homeHost);
        String str = restTemplate.getForEntity(homeHost + "servant", String.class).getBody() + "...";
        return str;
    }

}