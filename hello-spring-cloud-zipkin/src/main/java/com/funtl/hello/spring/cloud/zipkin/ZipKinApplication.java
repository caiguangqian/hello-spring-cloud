package com.funtl.hello.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/20 17:15
 **/
@EnableEurekaClient
@EnableZipkinServer
@SpringBootApplication
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class,args);
    }
}
