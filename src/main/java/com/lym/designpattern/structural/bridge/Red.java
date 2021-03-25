package com.lym.designpattern.structural.bridge;

/**
 * @ClassName Red
 * @Description 具体实现化角色：红色
 * @Author laiyiming
 * @Date 2021/3/3 15:31
 */
public class Red implements Color {

    @Override
    public String getColor() {
        return "red";
    }
}
