package com.xing.springmvcstatic_js_importdemo.service;

import com.xing.springmvcstatic_js_importdemo.entity.User;

import java.util.List;

public interface UserService {

    //根据姓名去查询用户
    User getUserByNameAndPassword(String username);

    //查询所有用户
    List<User> getAllUser();
}
