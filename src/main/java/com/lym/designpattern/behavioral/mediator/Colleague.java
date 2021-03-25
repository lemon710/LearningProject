package com.lym.designpattern.behavioral.mediator;

/**
 * @ClassName Colleague
 * @Description 抽象同事类
 * @Author laiyiming
 * @Date 2021/3/15 16:28
 */
abstract class Colleague {
    protected Mediator mediator;

    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();
}
