package com.atguigu.demo.designmodule.factory.morefactory;

public class SmsSender implements Sender {
  
    @Override  
    public void Send() {  
        System.out.println("this is sms sender!");  
    }  
}