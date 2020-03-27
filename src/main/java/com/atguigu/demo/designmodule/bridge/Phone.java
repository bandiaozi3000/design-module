package com.atguigu.demo.designmodule.bridge;

/**
 * 第三步：定义Abstraction手机抽象类
 */
public abstract class Phone {

    public Memory phoneMemory;

    public void setPhoneMemory(Memory phoneMemory) {
        this.phoneMemory = phoneMemory;
    }

    public abstract  void buyPhone();
}
