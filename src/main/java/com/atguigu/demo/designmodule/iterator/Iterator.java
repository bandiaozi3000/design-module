package com.atguigu.demo.designmodule.iterator;

//抽象迭代器
interface Iterator
{
    Object first();
    Object next();
    boolean hasNext();
}