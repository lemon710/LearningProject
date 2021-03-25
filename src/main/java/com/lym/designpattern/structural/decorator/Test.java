package com.lym.designpattern.structural.decorator;

/**
 * @ClassName Test
 * @Description
 * @Author laiyiming
 * @Date 2021/3/5 17:23
 */
public class Test {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("-------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
