package com.atguigu.demo.designmodule.state.another;

public abstract class AirState {

    protected AirController controller;

    public abstract void powerOn();

    public abstract void powerOff();

    public abstract void adjustTemp();

    public void setController(AirController controller) {
        this.controller = controller;
    }
}