package com.lym.designpattern.creational.factorymethod;

/**
 * @ClassName ConcreteFactory2
 * @Description 具体工厂2：实现了厂品的生成方法
 * @Author laiyiming
 * @Date 2021/2/5 14:01
 */
public class ConcreteFactory2 implements AbstractFactory{

    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
