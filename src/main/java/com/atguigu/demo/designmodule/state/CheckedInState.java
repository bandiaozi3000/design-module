package com.atguigu.demo.designmodule.state;

/**
 * 已入住状态
 * @author 波波烤鸭
 * @email dengpbs@163.com
 *
 */
public class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("房间已入住！请勿打扰！");
	}

}
