package com.springboot.springbootwebdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody //当前类的所有内容都写给浏览器，或者用RestController标注替代ResponseBody和Controller
//@Controller

@RestController
public class HelloController {

//    @RequestMapping("/index")
//    public String index(){
//        return "index";
//    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
