package com.lym.designpattern.behavioral.strategy;

/**
 * @ClassName ConcreteStrategyB
 * @Description 具体策略B
 * @Author laiyiming
 * @Date 2021/3/12 14:52
 */
public class ConcreteStrategyB implements Strategy{
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
