package com.lym.designpattern.creational.prototype;

import java.util.Scanner;

/**
 * @ClassName Circle
 * @Description 原型Circle
 * @Author laiyiming
 * @Date 2021/1/26 11:18
 */
public class Circle implements Shape {

    /**
     * 拷贝
     *
     * @return
     */
    @Override
    public Object clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝Circle失败");
        }
        return circle;
    }

    /**
     * 计算面积
     */
    @Override
    public void countArea() {
        int r = 0;
        System.out.println("这是一个圆，请输入圆的半径：");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该圆的面积=" + Math.PI * Math.pow(r,2) + "\n");
    }
}
