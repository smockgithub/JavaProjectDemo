package com.springboot.springbootwebdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping(value ="/user/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){

        if("admin".equals(username) && "123456".equals(password)){
            session.setAttribute("loginUser",username);
            return  "redirect:/main.html";
        }else{
            map.put("msg","用户名或密码错误");
            session.setAttribute("loginUser",null);
            return "login";
        }

    }
}
