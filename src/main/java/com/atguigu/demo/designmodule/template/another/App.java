package com.atguigu.demo.designmodule.template.another;

public class App {
    
    public static void main(String[] args) {
        
        HummerH1 h1 = new HummerH1();
        // 我就不想听见H1的喇叭响！
        h1.setAlarm(false);
        h1.run();
        
        HummerH2 h2 = new HummerH2();
        h2.run();
        
    }

}
