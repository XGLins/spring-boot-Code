package com.xing.springmvcstatic_js_importdemo.controller;


import com.xing.springmvcstatic_js_importdemo.entity.User;
import com.xing.springmvcstatic_js_importdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author XGLins
 * @date 2023/4/13 10:53
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("allUsers")
    public List<User> getAllUsers() {
        System.out.println(userService.getAllUser());

        return userService.getAllUser();
    }

}
