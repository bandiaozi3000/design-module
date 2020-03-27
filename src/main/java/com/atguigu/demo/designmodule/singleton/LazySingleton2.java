package com.atguigu.demo.designmodule.singleton;

public class LazySingleton2
{
    private static volatile LazySingleton2 instance=null;    //保证 instance 在所有线程中同步
    private LazySingleton2(){}    //private 避免类在外部被实例化
    public static synchronized LazySingleton2 getInstance()
    {
        //getInstance 方法前加同步
        if(instance==null)
        {
            instance=new LazySingleton2();
        }
        return instance;
    }
}