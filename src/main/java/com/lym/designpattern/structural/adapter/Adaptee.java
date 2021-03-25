package com.lym.designpattern.structural.adapter;

/**
 * @ClassName Adaptee
 * @Description 适配器接口
 * @Author laiyiming
 * @Date 2021/3/3 14:46
 */
public class Adaptee {
    public void specificRequest(){
        System.out.println("适配器中的业务代码被调用！");
    }
}
