package com.atguigu.demo.designmodule.singleton;

public class StarzeSingleton {
    private static StarzeSingleton instance = new StarzeSingleton();
    private StarzeSingleton (){}
    public static StarzeSingleton getInstance() {
    return instance;
    }  
}

