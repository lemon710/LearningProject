package com.lym.designpattern.behavioral.visitor;

/**
 * @ClassName Test
 * @Description
 * @Author laiyiming
 * @Date 2021/3/16 10:11
 */
public class Test {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }
}
