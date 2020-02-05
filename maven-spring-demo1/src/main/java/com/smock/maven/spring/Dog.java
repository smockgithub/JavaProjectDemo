package com.smock.maven.spring;

public class Dog {
    private String name;

    public Dog() {
        System.out.println("我被初始化了！我是无参数的构造");
    }

    public Dog(String name) {
        this.name = name;
        System.out.println("我是有参数的构造："+name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName(){
        System.out.println("狗的名字是："+this.name);
    }

}
