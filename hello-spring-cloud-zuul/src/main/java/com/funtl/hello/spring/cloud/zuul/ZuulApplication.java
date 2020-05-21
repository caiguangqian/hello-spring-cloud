package com.funtl.hello.spring.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package com.funtl.spring.cloud.zuul
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/20 10:52
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
