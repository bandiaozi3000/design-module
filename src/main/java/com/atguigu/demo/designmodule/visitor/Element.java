package com.atguigu.demo.designmodule.visitor;

//抽象元素类
interface Element
{
    void accept(Visitor visitor);
}