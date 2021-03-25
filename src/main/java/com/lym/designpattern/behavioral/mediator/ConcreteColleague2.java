package com.lym.designpattern.behavioral.mediator;

/**
 * @ClassName ConcreteColleague2
 * @Description 具体同事类
 * @Author laiyiming
 * @Date 2021/3/15 16:45
 */
public class ConcreteColleague2 extends Colleague {

    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    public void send() {
        System.out.println("具体同事类2发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
