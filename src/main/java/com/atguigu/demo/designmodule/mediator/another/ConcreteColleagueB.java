package com.atguigu.demo.designmodule.mediator.another;

public class ConcreteColleagueB extends AbstractColleague {
    private String strAttribute;

    public ConcreteColleagueB(String str) {
        this.strAttribute = str;
    }

    @Override
    public void changeString(String str) {
        this.strAttribute = this.strAttribute + "这是同事A对我的影响：" + str;

    }

    @Override
    public void setString(String str, AbstractMediator am) {
        am.bChangedA(str);
    }

    public String getStrAttribute() {
        return strAttribute;
    }
}

