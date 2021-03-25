package com.lym.designpattern.behavioral.strategy;

/**
 * @ClassName Context
 * @Description 环境类
 * @Author laiyiming
 * @Date 2021/3/12 14:52
 */
public class Context {
    private Strategy strategy;
    public Strategy getStrategy() {
        return strategy;
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
