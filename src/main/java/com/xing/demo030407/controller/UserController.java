package com.xing.demo030407.controller;

import com.xing.demo030407.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author XGLins
 * @date 2023/4/7 9:24
 */
@Controller
@RequestMapping("")
public class UserController {

    /* Model用法 */
    @RequestMapping("getData1")
    public String getData1(Model model) {
        model.addAttribute("msg","msg:小欣在上课！");
        System.out.println("成功！");
        return "index";
    }

    /* ModelAndView用法 */
    @RequestMapping("getData2")
    public ModelAndView getData2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","msg:周六下午要大扫除！");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    /* ModelAndView用法之-User对象*/
    @RequestMapping("getData3")
    public ModelAndView getData3() {
        User user = new User();
        user.setName("张三");
        user.setAge(20);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("user");
        return modelAndView;

    }



}
