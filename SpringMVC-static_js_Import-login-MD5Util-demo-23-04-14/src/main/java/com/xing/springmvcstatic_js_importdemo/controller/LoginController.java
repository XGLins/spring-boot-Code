package com.xing.springmvcstatic_js_importdemo.controller;

import com.xing.springmvcstatic_js_importdemo.entity.User;
import com.xing.springmvcstatic_js_importdemo.service.UserService;
import com.xing.springmvcstatic_js_importdemo.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author XGLins
 * @date 2023/4/12 11:23
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("login"  )
    public String login() {
        return "login";
    }

    @RequestMapping("index"  )
    public String index() {
        return "success";
    }
    @RequestMapping("index2"  )
    public String index2() {
        return "fail";
    }
    /**
     * 登录
     * */
    @RequestMapping(value = "login2" , method= RequestMethod.POST)
    @ResponseBody
    public String login2(@RequestBody User user) {

        //判断当前用户是否存在
        User user1 = userService.getUserByNameAndPassword(user.getUsername());
        if(user1==null){
            return "fail";
        }

        String mdSslat = MD5Util.md5slat(user.getPassword());
        String mdSslat2 = MD5Util.md5slat(user1.getPassword());
        //比较前端传送过来的密码与数据库中的密码是否一致
        if (mdSslat.equals(mdSslat2)){
            return "success";
        }


        System.out.println("我是对象查出来的user1："+user1);
        System.out.println("我是浏览器输入的name：" + user.getUsername());
        System.out.println("我是浏览器输入的password：" + user.getPassword());

        return "fail";
    }
}
