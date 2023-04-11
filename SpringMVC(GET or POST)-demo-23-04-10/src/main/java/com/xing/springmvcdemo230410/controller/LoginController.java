package com.xing.springmvcdemo230410.controller;

import com.xing.springmvcdemo230410.entity.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author XGLins
 * @date 2023/4/10 9:43
 */
@Controller
public class LoginController {

    /**
     * 使用 POST 传参
     * @RequestParam("前端的-name")
     * http://localhost:8098/login.html
     * */
    @RequestMapping(value = "login" , method = RequestMethod.POST )
    public String login(String name, String password){
        System.out.println(name);
        System.out.println(password);
        return "tIndex";
    }

    /**
     * 使用GET  ?方式传参
     * http://localhost:8098/testParam?id=1
     */
    @RequestMapping("testParam")
    public String testRequestParam(Integer id){
        System.out.println("===========使用 ? 方式传参id为：================" + id);
        return "tIndex";
    }

    /**
     * 使用GET   /方式传参
     *http://localhost:8098/user/2
     * */
    @RequestMapping(value="/user/{id}",method = RequestMethod.GET)//RequestMethod默认是GET方法
    public String testRequestParam2(@PathVariable Integer id){
        System.out.println("===========使用 / 方式传参id为：================" + id);
        return "tIndex";
    }

    /**
     * 传送一个对象
     * http://localhost:8098/teacher
     * */
    @RequestMapping("teacher")
    public String testRequestParam3( Teacher teacher){
        teacher.setName("林哈哈");
        teacher.setAge(21);
        System.out.println("======使用  对象 方式传参Teacher为：==========" + "姓名：" + teacher.getName()
                + "------年龄：" + teacher.getAge());
        return "tIndex";
    }


}
