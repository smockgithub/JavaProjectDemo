package com.springboot.springbootwebdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping(value ="/user/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,@RequestParam("password") String password,
                        Map<String,Object> map){

        if("admin".equals(username) && "123456".equals(password)){
            return  "redirect:/main.html";
        }else{
            map.put("msg","用户名或密码错误");
            return "login";
        }

    }
}
