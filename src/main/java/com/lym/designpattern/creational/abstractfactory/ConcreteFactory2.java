package com.lym.designpattern.creational.abstractfactory;

/**
 * @ClassName ConcreteFactory2
 * @Description 具体工厂2：实现了厂品的生成方法
 * @Author laiyiming
 * @Date 2021/2/5 14:01
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
