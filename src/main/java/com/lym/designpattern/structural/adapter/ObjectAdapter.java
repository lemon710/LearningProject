package com.lym.designpattern.structural.adapter;

/**
 * @ClassName ObjectAdapter
 * @Description 对象适配器类
 * @Author laiyiming
 * @Date 2021/3/3 14:52
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
