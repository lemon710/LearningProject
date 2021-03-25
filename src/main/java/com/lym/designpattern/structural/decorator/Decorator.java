package com.lym.designpattern.structural.decorator;

/**
 * @ClassName Decorator
 * @Description 抽象装饰角色
 * @Author laiyiming
 * @Date 2021/3/5 17:19
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
