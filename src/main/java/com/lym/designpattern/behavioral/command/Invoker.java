package com.lym.designpattern.behavioral.command;

/**
 * @ClassName Invoker
 * @Description 调用者
 * @Author laiyiming
 * @Date 2021/3/12 15:35
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
