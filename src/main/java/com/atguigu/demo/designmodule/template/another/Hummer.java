package com.atguigu.demo.designmodule.template.another;

public abstract class Hummer {
    
    protected abstract void start(); // 启动汽车
    protected abstract void stop(); // 刹车
    protected abstract void alarm(); // 鸣笛
    protected abstract void engineBoom(); // 启动引擎
    
    // 钩子方法，默认喇叭是会响的
    protected boolean isAlarm() { 
        return true; 
    }
    
    // 汽车行驶的过程
    public final void run() {
        start();
        engineBoom();
        if(isAlarm()) {
            alarm();
        }
        stop();
    } 
    
}