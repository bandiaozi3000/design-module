package com.atguigu.demo.designmodule.adapter.classdapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void method2() {
        System.out.println("method 2");
    }
}
