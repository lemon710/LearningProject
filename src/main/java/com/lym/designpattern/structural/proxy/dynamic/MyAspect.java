package com.lym.designpattern.structural.proxy.dynamic;

/**
 * @ClassName MyAspect
 * @Description 切面类
 * @Author laiyiming
 * @Date 2021/2/8 14:38
 */
public class MyAspect {
    public void myBefore() {
        System.out.println("方法执行之前");
    }
    public void myAfter() {
        System.out.println("方法执行之后");
    }
}
