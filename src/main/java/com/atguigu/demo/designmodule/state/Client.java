package com.atguigu.demo.designmodule.state;

public class Client {
	public static void main(String[] args) {
		// 获取房间对象
		HomeContext ctx = new HomeContext();
		// 设置房间状态
		ctx.setState(new FreeState());
		ctx.setState(new BookedState());
	}
}
