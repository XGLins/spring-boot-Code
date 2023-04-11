package com.xing.demo030407.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author XGLins
 * @date 2023/4/7 9:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    /*用户姓名*/
    private String name;

    /*用户年龄*/
    private int age;
}
