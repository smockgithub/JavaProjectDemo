package com.springboot.springbootwebdemo1.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*

spring5以上版本不建议使用，所以把原来的继承 WebMvcConfigurerAdapter改为

public class CustomWebConigurer implements WebMvcConfigurer
可以实现相同的功能。

是1.8以后接口中可以不必实现接口的抽象方法才变化的。

WebMvcConfigurerAdapter 其实也是实现了 WebMvcConfigurer接口的

 */

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
    }
}
