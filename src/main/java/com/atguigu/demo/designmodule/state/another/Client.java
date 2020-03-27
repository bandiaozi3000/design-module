package com.atguigu.demo.designmodule.state.another;

public class Client {

    public static void main(String[] args) {

        AirController controller = new AirController();

        controller.powerOn();

        controller.adjustTemp();

        controller.powerOff();

        controller.adjustTemp();
    }
}