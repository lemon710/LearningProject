package com.lym.designpattern.creational.factorymethod;

/**
 * @ClassName Test
 * @Description 工厂方法测试
 * @Author laiyiming
 * @Date 2021/2/5 14:04
 */
public class Test {
    public static void main(String[] args) {
        try {
            Product a;
            AbstractFactory af;
            af = (AbstractFactory) ReadXML.getObject();
            a = af.newProduct();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
