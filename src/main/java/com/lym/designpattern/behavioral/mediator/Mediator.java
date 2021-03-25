package com.lym.designpattern.behavioral.mediator;

/**
 * @ClassName Mediator
 * @Description 抽象中介者
 * @Author laiyiming
 * @Date 2021/3/15 16:27
 */
abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl); //转发
}
