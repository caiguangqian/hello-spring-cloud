package com.funtl.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/19 23:24
 **/
@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message="+message,String.class);
    }

    public String hiError(String message){
        return String.format("Hi your message is : %s but request is bad",message);
    }
}
