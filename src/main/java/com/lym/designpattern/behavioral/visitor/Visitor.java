package com.lym.designpattern.behavioral.visitor;

/**
 * @ClassName Visitor
 * @Description 抽象访问者
 * @Author laiyiming
 * @Date 2021/3/16 9:50
 */
public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
