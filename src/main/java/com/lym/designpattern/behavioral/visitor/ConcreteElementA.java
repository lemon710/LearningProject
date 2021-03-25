package com.lym.designpattern.behavioral.visitor;

/**
 * @ClassName ConcreteElementA
 * @Description 具体元素A类
 * @Author laiyiming
 * @Date 2021/3/16 10:09
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作。";
    }
}
