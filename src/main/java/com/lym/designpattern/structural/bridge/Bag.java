package com.lym.designpattern.structural.bridge;

/**
 * @ClassName Bag
 * @Description 抽象化角色：包
 * @Author laiyiming
 * @Date 2021/3/3 15:32
 */
abstract class Bag {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract String getName();
}
