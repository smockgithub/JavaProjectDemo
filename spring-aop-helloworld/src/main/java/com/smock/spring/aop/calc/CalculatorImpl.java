package com.smock.spring.aop.calc;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        return i+j;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
