package com.springboot.springbootwebdemo1.controller;

import com.springboot.springbootwebdemo1.dao.EmployeeDao;
import com.springboot.springbootwebdemo1.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

    //注入员工dal
    @Autowired
    EmployeeDao employeeDao;

    //查询员工列表
    @GetMapping("/emps")
    //Model请求域的上下文
    public String list(Model model){

        Collection<Employee> employees = employeeDao.getAll();

        model.addAttribute("emps",employees);

        //thymeleaf配置的指向templates
        //ThymeleafProperties DEFAULT_PREFIX
        return "emp/list";//
    }
}
