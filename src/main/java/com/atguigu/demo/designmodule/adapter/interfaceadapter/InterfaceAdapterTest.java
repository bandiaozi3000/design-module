package com.atguigu.demo.designmodule.adapter.interfaceadapter;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InterfaceAdapterTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //KeyListener:我们只需要其中一个方法,这样就显得很累赘
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("hey geek!");
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        //KeyAdapter:可以看出该类实现KeyListener接口并提供了默认的方法,这样就只需要重写其中一个方法
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("fxcku!");
            }
        });
    }

}
