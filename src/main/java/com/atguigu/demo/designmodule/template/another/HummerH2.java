package com.atguigu.demo.designmodule.template.another;

public class HummerH2 extends Hummer {
    
    @Override
    public void start() {
        System.out.println("悍马H2启动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停止...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎轰鸣...");
    }
    
    @Override
    public boolean isAlarm() {
        return false;
    }

}