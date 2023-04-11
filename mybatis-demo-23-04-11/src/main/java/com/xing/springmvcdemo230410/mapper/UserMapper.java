package com.xing.springmvcdemo230410.mapper;

import com.xing.springmvcdemo230410.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author XGLins
 * @date 2023/4/11 10:03
 */
@Mapper
public interface UserMapper {

    List<User> getAll();
}
