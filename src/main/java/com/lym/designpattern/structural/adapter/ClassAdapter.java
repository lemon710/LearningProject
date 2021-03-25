package com.lym.designpattern.structural.adapter;

/**
 * @ClassName ClassAdapter
 * @Description 类适配器类
 * @Author laiyiming
 * @Date 2021/3/3 14:48
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
