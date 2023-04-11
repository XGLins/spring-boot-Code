package com.xing.springmvcdemo230410.controller;

import com.xing.springmvcdemo230410.entity.User;
import com.xing.springmvcdemo230410.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author XGLins
 * @date 2023/4/11 9:49
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUsers")
    public List<User> getUsers() {
        System.out.println(userService.getAll());

        return userService.getAll();
    }
}
