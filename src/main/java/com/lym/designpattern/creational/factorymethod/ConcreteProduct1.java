package com.lym.designpattern.creational.factorymethod;

/**
 * @ClassName ConcreteProduct1
 * @Description 具体产品1：实现抽象产品中的抽象方法
 * @Author laiyiming
 * @Date 2021/2/5 13:58
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
