package com.xing.springmvcstatic_js_importdemo.mapper;

import com.xing.springmvcstatic_js_importdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //根据姓名去查询用户
    User getUserByNameAndPassword(String username);

    //查询所有用户
    List<User> getAllUser();

}
