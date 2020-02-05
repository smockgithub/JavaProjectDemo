package com.smock.maven.spring;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //从注入的容器里找到对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");//执行初始化，会触发无参数构造

        Dog dog = (Dog)ctx.getBean("Dog");//从Ioc里获取Dog对象

        dog.showName();//初始化Dog，并执行配置文件里的构造

        dog.setName("BB");

        dog.showName();
    }
}
