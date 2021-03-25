package com.lym.designpattern.behavioral.visitor;

/**
 * @ClassName ConcreteVisitorA
 * @Description 具体访问者A类
 * @Author laiyiming
 * @Date 2021/3/16 10:06
 */
public class ConcreteVisitorA implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问-->" + element.operationB());
    }
}
