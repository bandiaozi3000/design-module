package com.atguigu.demo.designmodule.flyweight;

public abstract  class IgoChessman {
	//共享抽象方法棋子的颜色
	public abstract String chessColor();
	
	public void display() {
		System.out.println("棋子:"+this.chessColor());
	}
}
