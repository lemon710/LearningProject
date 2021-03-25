package com.lym.designpattern.behavioral.command;

/**
 * @ClassName ConcreteCommand
 * @Description 具体命令
 * @Author laiyiming
 * @Date 2021/3/12 15:28
 */
public class ConcreteCommand implements Command{

    private Receiver receiver;

    ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
