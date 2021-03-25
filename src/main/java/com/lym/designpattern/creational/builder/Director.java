package com.lym.designpattern.creational.builder;

/**
 * @ClassName Director
 * @Description 指挥者：调用建造者中的方法完成复杂对象的创建。
 * @Author laiyiming
 * @Date 2021/2/5 15:52
 */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
