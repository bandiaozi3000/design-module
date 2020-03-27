package com.atguigu.demo.designmodule.state;

/**
 * 空闲状态
 * @author 波波烤鸭
 * @email dengpbs@163.com
 *
 */
public class FreeState implements State {

	@Override
	public void handle() {
		System.out.println("房间空闲！！！没人住！");
	}
}
