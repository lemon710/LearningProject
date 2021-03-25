package com.lym.designpattern.behavioral.strategy;

/**
 * @ClassName Test
 * @Description
 * @Author laiyiming
 * @Date 2021/3/12 14:55
 */
public class Test {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
