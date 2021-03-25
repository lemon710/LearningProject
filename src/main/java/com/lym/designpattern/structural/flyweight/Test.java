package com.lym.designpattern.structural.flyweight;

/**
 * @ClassName Test
 * @Description
 * @Author laiyiming
 * @Date 2021/3/5 15:37
 */
public class Test {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight f01 = flyweightFactory.getFlyweight("a");
        Flyweight f02 = flyweightFactory.getFlyweight("a");
        Flyweight f03 = flyweightFactory.getFlyweight("a");
        Flyweight f11 = flyweightFactory.getFlyweight("b");
        Flyweight f12 = flyweightFactory.getFlyweight("b");
        f01.operation(new UnSharedConcreteFlyweight("第一次调用a"));
        f02.operation(new UnSharedConcreteFlyweight("第二次调用a"));
        f03.operation(new UnSharedConcreteFlyweight("第三次调用a"));
        f11.operation(new UnSharedConcreteFlyweight("第一次调用b"));
        f12.operation(new UnSharedConcreteFlyweight("第二次调用b"));
    }
}
