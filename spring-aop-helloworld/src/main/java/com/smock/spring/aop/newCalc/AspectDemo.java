package com.smock.spring.aop.newCalc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//把这个类申明成切面：
//1、需要放入到IOC容器里，@component
//2、再申明为一个切面，@Aspect

//3、这些切点再哪个方法切入执行，@before("")：注解的方式，有一定的语法可以模糊匹配
//https://blog.csdn.net/qq_37495786/article/details/88704192
//4、配置applicationContext.xml：<aop:aspectj-autoproxy></aop:aspectj-autoproxy>
@Component
@Aspect
public class AspectDemo {
    //声明到哪个方法切入
    @Before("execution(public int com.smock.spring.aop.newCalc.Calculator.add(..))")
    public void beforeMethod(){
        System.out.println("the method is begins");
    }

    @Before("execution(public int com.smock.spring.aop.newCalc.Calculator.add(..))")
    public void beforeMethod2(JoinPoint joinPoint){
        System.out.println("the method "+joinPoint.getSignature().getName()+" is begins2 , args :"+ Arrays.asList(joinPoint.getArgs()));
    }
}
