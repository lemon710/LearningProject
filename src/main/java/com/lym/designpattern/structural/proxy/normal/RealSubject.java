package com.lym.designpattern.structural.proxy.normal;

/**
 * @ClassName RealSubject
 * @Description 真实主题
 * @Author laiyiming
 * @Date 2021/2/8 14:11
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }

}
