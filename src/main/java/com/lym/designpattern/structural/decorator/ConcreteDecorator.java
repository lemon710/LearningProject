package com.lym.designpattern.structural.decorator;

/**
 * @ClassName ConcreteDecorator
 * @Description 具体装饰角色
 * @Author laiyiming
 * @Date 2021/3/5 17:21
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
