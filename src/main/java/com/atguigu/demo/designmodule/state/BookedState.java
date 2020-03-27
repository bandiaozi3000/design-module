package com.atguigu.demo.designmodule.state;

/**
 * 已预订状态
 * @author 波波烤鸭
 * @email dengpbs@163.com
 *
 */
public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("房间已预订！别人不能定！");
	}
}
