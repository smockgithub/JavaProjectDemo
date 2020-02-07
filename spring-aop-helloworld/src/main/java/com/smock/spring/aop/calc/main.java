package com.smock.spring.aop.calc;

public class main {
    public static void main(String[] args) {
        //正常情况下的对象引用，如果要用AOP需要创建中间代理。
        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1,2);
        System.out.println(result);

        Calculator proxy = new CalculatorProxy(calculator).getProxy();//使用代理对象，非单例
        //通过代理对象调用目标方法，触发代理机制
        result = proxy.add(3,5);

        System.out.println(result);

    }
}
