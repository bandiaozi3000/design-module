package com.atguigu.demo.designmodule.factory.morefactory;

import com.atguigu.demo.designmodule.factory.abstractfactory.Provider;
import com.atguigu.demo.designmodule.factory.abstractfactory.SendMailFactory;
import com.atguigu.demo.designmodule.factory.abstractfactory.Sender;

public class Test {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
