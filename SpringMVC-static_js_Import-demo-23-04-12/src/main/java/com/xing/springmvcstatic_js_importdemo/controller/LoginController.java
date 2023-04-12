package com.xing.springmvcstatic_js_importdemo.controller;

import com.xing.springmvcstatic_js_importdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author XGLins
 * @date 2023/4/12 11:23
 */
@Controller
public class LoginController {

    @RequestMapping("login"  )
    public String login() {
        return "login";
    }

    @RequestMapping(value = "login2" , method= RequestMethod.POST)
    public String login2(@RequestBody User user) {
        System.out.println("======" + user.getUsername());
        System.out.println("======" + user.getPassword());

        return "login";
    }
}
