package com.lym.designpattern.structural.bridge;

/**
 * @ClassName HandBag
 * @Description 扩展抽象化角色：挎包
 * @Author laiyiming
 * @Date 2021/3/3 15:35
 */
public class HandBag extends Bag {

    @Override
    public String getName() {
        return color.getColor() + "HandBag";
    }
}
