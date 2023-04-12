package com.xing.springmvcstatic_js_importdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author XGLins
 * @date 2023/4/12 11:37
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String username;
    private String password;
}
