package com.atguigu.demo.designmodule.decorator;

public class ManDecorator extends AbstractDecorator {
	public ManDecorator(Human human) {
		//调用父类的构造方法
		super(human);
	}
	
	//装饰类增加的功能
	private void fly() {
		System.out.println("人可以飞");
	}
 
	//增强了功能的run方法
	@Override
	public void run() {
		super.run();
		fly();
	}
}
