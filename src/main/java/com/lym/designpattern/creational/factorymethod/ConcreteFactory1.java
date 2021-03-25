package com.lym.designpattern.creational.factorymethod;

/**
 * @ClassName ConcreteFactory1
 * @Description 具体工厂1：实现了厂品的生成方法
 * @Author laiyiming
 * @Date 2021/2/5 14:01
 */
public class ConcreteFactory1 implements AbstractFactory{

    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
