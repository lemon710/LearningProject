package com.lym.designpattern.behavioral.observer;

import java.util.Observable;

/**
 * @ClassName OilFutures
 * @Description 具体目标类：原油期货
 * @Author laiyiming
 * @Date 2021/3/15 15:42
 */
public class OilFutures extends Observable {

    private float price;

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        super.setChanged();  //设置内部标志位，注明数据发生变化
        super.notifyObservers(price);    //通知观察者价格改变了
        this.price = price;
    }
}
