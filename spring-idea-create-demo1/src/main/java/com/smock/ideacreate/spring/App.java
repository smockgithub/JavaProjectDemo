package com.smock.ideacreate.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //从注入的容器里找到对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");//执行初始化，会触发无参数构造

        Dog dog = (Dog)ctx.getBean("Dog");//从Ioc里获取Dog对象,applicationContext.xml配置的对象id

        dog.showName();//初始化Dog，并执行配置文件里的构造
    }
}
