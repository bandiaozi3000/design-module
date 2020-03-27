package com.atguigu.demo.designmodule.decorator;

public class Client {
	public static void main(String[] args) {
		//创建被装饰的类
		Human human = new Man();
		
		//创建装饰的类，并添加被装饰类的引用
		Human superMan = new ManDecorator(human);
		
		//执行增强后的run方法
		superMan.run();
	}
}
