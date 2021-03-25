package com.lym.designpattern.structural.flyweight;

/**
 * @ClassName Flyweight
 * @Description 抽象享元角色
 * @Author laiyiming
 * @Date 2021/3/5 15:14
 */
public interface Flyweight {
    public void operation(UnSharedConcreteFlyweight state);
}
