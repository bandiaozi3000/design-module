package com.atguigu.demo.designmodule.template.another;

public class HummerH1 extends Hummer {
    
    private boolean alarmFlag = true; //是否要响喇叭
    
    //要不要响喇叭，是由用户来决定的
    public void setAlarm(boolean isAlarm){ 
        this.alarmFlag = isAlarm; 
    }

    @Override
    public void start() {
        System.out.println("悍马H1启动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停止...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎轰鸣...");
    }
    
    //钩子方法，默认喇叭是会响的
    @Override
    protected boolean isAlarm(){ 
        return this.alarmFlag; 
    }

}