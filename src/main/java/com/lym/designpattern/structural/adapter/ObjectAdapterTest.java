package com.lym.designpattern.structural.adapter;

/**
 * @ClassName ObjectAdapterTest
 * @Description
 * @Author laiyiming
 * @Date 2021/3/3 14:58
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
