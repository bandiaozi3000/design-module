package com.atguigu.demo.designmodule.bridge;

/**
 * 第二步：定义ConcreteImplementor，这里指具体的内存
 * 内存这里定义了两种一种是6G，一种是8G
 */
public class Memory6G implements Memory {
    @Override
    public void addMemory() {
        System.out.println("手机安装了6G内存");
    }
}
