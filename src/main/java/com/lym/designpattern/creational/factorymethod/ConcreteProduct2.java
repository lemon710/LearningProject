package com.lym.designpattern.creational.factorymethod;

/**
 * @ClassName ConcreteProduct2
 * @Description 具体产品2：实现抽象产品中的抽象方法
 * @Author laiyiming
 * @Date 2021/2/5 13:58
 */
public class ConcreteProduct2 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品2显示...");
    }
}
