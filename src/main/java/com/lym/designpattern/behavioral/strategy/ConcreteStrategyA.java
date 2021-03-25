package com.lym.designpattern.behavioral.strategy;

/**
 * @ClassName ConcreteStrategyA
 * @Description 具体策略A
 * @Author laiyiming
 * @Date 2021/3/12 14:51
 */
public class ConcreteStrategyA implements Strategy{
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
