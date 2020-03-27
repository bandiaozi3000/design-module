package com.atguigu.demo.designmodule.bridge;

public class XiaoMi extends Phone{
    @Override
    public void buyPhone() {
        phoneMemory.addMemory();
        System.out.println("购买小米手机");
    }
}
