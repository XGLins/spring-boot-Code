package com.yml_demo.yml.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Value("${url.orderUrl}")
    private String url;

    @RequestMapping("test")
    public void test(){
        System.out.println(url);

    }
}
