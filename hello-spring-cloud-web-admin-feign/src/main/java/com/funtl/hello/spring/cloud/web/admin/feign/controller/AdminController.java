package com.funtl.hello.spring.cloud.web.admin.feign.controller;

import com.funtl.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/5/19 23:52
 **/
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(String message){
        return adminService.sayHi(message);
    }
}
