package com.atguigu.demo.designmodule.factory.morefactory;

public class MailSender implements Sender {
    @Override  
    public void Send() {  
        System.out.println("this is mailsender!");  
    }  
}