package com.atguigu.demo.designmodule.factory.abstractfactory;

public class SendSmsFactory implements Provider{
  
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}