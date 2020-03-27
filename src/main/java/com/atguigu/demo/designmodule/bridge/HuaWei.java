package com.atguigu.demo.designmodule.bridge;

public class HuaWei extends  Phone {
    @Override
    public void buyPhone() {
        phoneMemory.addMemory();
        System.out.println("购买华为手机");
    }
}
