package com.lym.designpattern.structural.decorator;

/**
 * @ClassName ConcreteComponent
 * @Description 具体构件角色
 * @Author laiyiming
 * @Date 2021/3/5 17:17
 */
public class ConcreteComponent implements Component {

    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法");
    }
}
