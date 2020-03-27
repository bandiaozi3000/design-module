package com.atguigu.demo.designmodule.prototype;


import java.util.HashMap;


public class FileProtoType extends ProtoType {

    public FileProtoType(int i, String aaa, HashMap<String, Double> hashMap) {
        super(i,aaa,hashMap);
    }

    public void show(){
        System.out.println("文件名"+this.getFileid());
        System.out.println("文件号"+this.getFilename());
        System.out.println("文件打分"+this.getScores());
    }
}
