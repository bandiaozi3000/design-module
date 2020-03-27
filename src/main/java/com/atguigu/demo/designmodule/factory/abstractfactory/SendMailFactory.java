package com.atguigu.demo.designmodule.factory.abstractfactory;

public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
