package com.lym.designpattern.behavioral.visitor;

/**
 * @ClassName ConcreteVisitorB
 * @Description 具体访问者B类
 * @Author laiyiming
 * @Date 2021/3/16 10:07
 */
public class ConcreteVisitorB implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->" + element.operationB());
    }
}
