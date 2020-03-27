package com.atguigu.demo.designmodule.bridge;

public class Client {
    public static void main(String[] args) {
        Phone huawei = new HuaWei();
        huawei.setPhoneMemory(new Memory6G());
        huawei.buyPhone();
        Phone xiaomi = new XiaoMi();
        xiaomi.setPhoneMemory(new Memory8G());
        xiaomi.buyPhone();
    }
}
