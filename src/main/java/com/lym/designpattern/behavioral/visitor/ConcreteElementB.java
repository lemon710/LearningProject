package com.lym.designpattern.behavioral.visitor;

/**
 * @ClassName ConcreteElementB
 * @Description 具体元素B类
 * @Author laiyiming
 * @Date 2021/3/16 10:08
 */
public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素B的操作。";
    }
}
