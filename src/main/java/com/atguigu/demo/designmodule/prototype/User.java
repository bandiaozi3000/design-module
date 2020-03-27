package com.atguigu.demo.designmodule.prototype;

import java.util.HashMap;

/**
 * 原型模式浅拷贝:
 * 克隆是指克隆对象，在堆空间复制一块内存，是完全的两个对象，不是指针指向！浅克隆是指克隆一个对象，
 * 而该对象的属性只是基本数据类型，只克隆出该对象！深度克隆是指克隆的目标里面还有引用类型，引用类型里还有引用类型，
 * 同时把引用类型克隆出来叫深度克隆！常用的方法有两种，第一，需克隆的对象实现cloneable接口；
 * 第二，使用commons包提供的克隆方法。这两种方法都能实现深度克隆！
 *
 * 浅克隆:仅仅复制所克隆的对象，而不复制它所引用的对象。被复制对象的所有变量都含有与原来的对象相同的值，
 * 而所有的对其他对象的引用仍然指向原来的对象。深克隆:把要复制的对象所引用的对象都复制了一遍。
 * 那些引用其他对象的变量将指向被复制过的新对象，而不再是原有的那些被引用的对象。很明显二者时间消耗有差距，在不影响的情况下尽量用浅克隆
 */
public class User implements Cloneable{
    private String userName;

    private HashMap<String,Double> hashMap;

    private  ProtoType protoType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public HashMap<String, Double> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Double> hashMap) {
        this.hashMap = hashMap;
    }

    public ProtoType getProtoType() {
        return protoType;
    }

    public void setProtoType(ProtoType protoType) {
        this.protoType = protoType;
    }

    public void show(){
        System.out.println("文件名"+this.getUserName());
        System.out.println("文件打分"+this.getHashMap());
        System.out.println("文件打分"+this.getProtoType());
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("aa",11.0);
        FileProtoType fileProtoType = new FileProtoType(1, "aaa", hashMap);
        FileProtoType fileProtoType1 =(FileProtoType) fileProtoType.clone();
        FileProtoType fileProtoType2 =(FileProtoType) fileProtoType.clone();
        fileProtoType1.show();
        fileProtoType2.show();
        User user = new User();
        user.setUserName("aaaaa");
        user.setHashMap(hashMap);
        user.setProtoType(fileProtoType);
        User user1 = (User) user.clone();
        user1.show();
        System.out.println(user.getUserName()==user1.getUserName());
        System.out.println(user.getProtoType()==user1.getProtoType());
    }
}
