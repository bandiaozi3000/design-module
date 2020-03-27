package com.atguigu.demo.designmodule.factory.staticfactory;

public class SendFactory {
      
    public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
} 