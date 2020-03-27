package com.atguigu.demo.designmodule.bridge;

public class Memory8G implements  Memory{
    @Override
    public void addMemory() {
        System.out.println("手机安装了8G内存");
    }
}
