package com.smock.spring.aop.newCalc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //创建spring的ioc
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        Calculator calculator = ctx.getBean(Calculator.class);

        //使用bean
        int result = calculator.add(4,6);
        System.out.println(result);
    }
}
