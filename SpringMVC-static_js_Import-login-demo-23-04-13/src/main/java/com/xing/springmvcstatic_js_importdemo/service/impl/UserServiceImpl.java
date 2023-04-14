package com.xing.springmvcstatic_js_importdemo.service.impl;

import com.xing.springmvcstatic_js_importdemo.entity.User;
import com.xing.springmvcstatic_js_importdemo.mapper.UserMapper;
import com.xing.springmvcstatic_js_importdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XGLins
 * @date 2023/4/13 10:57
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //重写通过用户姓名查询信息方法
    @Override
    public User getUserByNameAndPassword(String username) {
        return userMapper.getUserByNameAndPassword(username);
    }

    //查询所有用户信息
    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
