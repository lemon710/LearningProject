package com.lym.designpattern.behavioral.command;

/**
 * @ClassName Test
 * @Description
 * @Author laiyiming
 * @Date 2021/3/12 15:37
 */
public class Test {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call方法...");
        ir.call();
    }
}
