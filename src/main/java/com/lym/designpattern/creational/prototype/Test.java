package com.lym.designpattern.creational.prototype;

/**
 * @ClassName Test
 * @Description
 * @Author laiyiming
 * @Date 2021/1/26 11:36
 */
public class Test {
    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape circle1 = (Circle) pm.getShape("Circle");
        circle1.countArea();
        Shape square1 = (Square) pm.getShape("Square");
        square1.countArea();

        pm.addShape("Circle2", (Circle) circle1.clone());
        pm.addShape("Square2", (Square) square1.clone());
        Shape circle2 = (Circle) pm.getShape("Circle2");
        circle2.countArea();
        Shape square2 = (Square) pm.getShape("Square23");
        square2.countArea();
    }
}
