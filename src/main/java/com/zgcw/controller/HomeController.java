package com.zgcw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //声明为控制器
@RequestMapping(path = "/home")  //请求映射
public class HomeController {
    @RequestMapping(path = "/test")  //请求映射
    public String index(Model model) {
        model.addAttribute("message", "Hello Spring MVC!");
        return "home/test";
    }
}