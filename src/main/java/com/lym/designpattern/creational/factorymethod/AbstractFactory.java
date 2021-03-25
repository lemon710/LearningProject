package com.lym.designpattern.creational.factorymethod;

/**
 * @ClassName AbstractFactory
 * @Description 抽象工厂：提供了厂品的生成方法
 * @Author laiyiming
 * @Date 2021/2/5 13:56
 */
public interface AbstractFactory {
    public Product newProduct();
}
