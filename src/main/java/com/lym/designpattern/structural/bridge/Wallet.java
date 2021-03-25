package com.lym.designpattern.structural.bridge;

/**
 * @ClassName Wallet
 * @Description 扩展抽象化角色：钱包
 * @Author laiyiming
 * @Date 2021/3/3 15:37
 */
public class Wallet extends Bag {

    @Override
    public String getName() {
        return color.getColor() + "Wallet";
    }
}
