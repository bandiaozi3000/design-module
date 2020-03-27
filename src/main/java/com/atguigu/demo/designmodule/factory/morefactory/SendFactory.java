package com.atguigu.demo.designmodule.factory.morefactory;

public class SendFactory {
   public Sender produceMail(){  
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}  