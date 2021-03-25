package com.lym.designpattern.creational.prototype;

import java.util.Scanner;

/**
 * @ClassName Square
 * @Description 原型Square
 * @Author laiyiming
 * @Date 2021/1/26 11:19
 */
public class Square implements Shape {
    public Object clone() {
        Square square = null;
        try {
            square = (Square)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝Square失败");
        }
        return square;
    }

    /**
     * 计算面积
     */
    @Override
    public void countArea() {
        int a = 0;
        System.out.println("这是一个正方形，请输入它的边长：");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("该正方形的面积=" + Math.pow(a,2) + "\n");
    }
}
