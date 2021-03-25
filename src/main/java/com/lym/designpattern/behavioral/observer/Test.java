package com.lym.designpattern.behavioral.observer;

import java.util.Observer;

/**
 * @ClassName Test
 * @Description
 * @Author laiyiming
 * @Date 2021/3/15 15:48
 */
public class Test {
    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        Observer bull = new Bull(); //多方
        Observer bear = new Bear(); //空方
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}
