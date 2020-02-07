/**
 *
 * 该动态代理方式比较繁琐，spring框架已经集成了aop的实现，我们采用spring的aop特性即可。
 */

package com.smock.spring.aop.calc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatorProxy {
    private Calculator target;//需要代理的对象

    //通过构造实现
    public CalculatorProxy(Calculator target) {
        System.out.println("CalculatorProxy的构造被执行了");
        this.target = target;
    }

    public Calculator getProxy(){
        Calculator proxy =null;

        //代理对象的加载器
        ClassLoader classLoader = this.target.getClass().getClassLoader();

        //代理对象的有哪些方法
        Class[] classes =  new Class[]{Calculator.class};

        //当调用的对象被执行时，执行哪些代码（创建切面，实现连接点、切点）
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            /**
             * proxy：被调用的对象
             * method：贝迪埃用的方法
             * args：调用的参数
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("proxy 的 invoke 被触发");

                //return null;
                /**
                如果直接 return null;
                因为返回是个空对象，则调用具体方法时，比如调用add方法，会报错
                Exception in thread "main" java.lang.NullPointerException
                at com.sun.proxy.$Proxy0.add(Unknown Source)
                at com.smock.spring.aop.calc.main.main

                 */

                //在目标切点切入一个方法调用之前的逻辑
                System.out.println("The method "+method.getName()+" is run by args："+ Arrays.asList(args));

                Object invoke = method.invoke(target, args);

                return invoke;
            }
        };
        proxy = (Calculator) Proxy.newProxyInstance(classLoader,classes,invocationHandler);
        return  proxy;
    }


}
