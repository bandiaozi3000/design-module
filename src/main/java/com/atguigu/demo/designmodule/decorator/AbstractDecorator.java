package com.atguigu.demo.designmodule.decorator;

public abstract class AbstractDecorator implements Human{
	//持有被装饰类的引用 
	private Human human;
	
	//构造函数注入被装饰者
	public AbstractDecorator(Human human) {
		this.human = human;
	}
	
	//调用被装饰类的方法
	@Override
	public void run() {
		human.run();
	}
}
