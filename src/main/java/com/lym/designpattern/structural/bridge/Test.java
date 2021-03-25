package com.lym.designpattern.structural.bridge;

/**
 * @ClassName Test
 * @Description
 * @Author laiyiming
 * @Date 2021/3/3 15:40
 */
public class Test {
    public static void main(String[] args) {
        Color color =  new Red();
        Bag bag = new Wallet();
        bag.setColor(color);
        System.out.println(bag.getName());
    }
}
