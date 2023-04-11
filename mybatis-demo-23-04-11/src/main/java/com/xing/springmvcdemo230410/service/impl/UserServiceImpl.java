package com.xing.springmvcdemo230410.service.impl;

import com.xing.springmvcdemo230410.entity.User;
import com.xing.springmvcdemo230410.mapper.UserMapper;
import com.xing.springmvcdemo230410.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XGLins
 * @date 2023/4/11 10:02
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
