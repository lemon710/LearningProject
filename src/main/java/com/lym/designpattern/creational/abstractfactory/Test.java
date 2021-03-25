package com.lym.designpattern.creational.abstractfactory;

/**
 * @ClassName Test
 * @Description 工厂方法测试
 * @Author laiyiming
 * @Date 2021/2/5 14:04
 */
public class Test {
    public static void main(String[] args) {
        try {
            Product1 a;
            Product2 b;
            AbstractFactory af;
            af = (AbstractFactory) ReadXML.getObject();
            a = af.newProduct1();
            b = af.newProduct2();
            a.show();
            b.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
