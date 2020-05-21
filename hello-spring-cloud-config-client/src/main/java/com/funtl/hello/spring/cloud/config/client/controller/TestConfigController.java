package com.funtl.hello.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/20 15:43
 **/
@RestController
public class TestConfigController {

    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return foo;
    }
}
