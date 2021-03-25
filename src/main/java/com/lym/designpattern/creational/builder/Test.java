package com.lym.designpattern.creational.builder;

/**
 * @ClassName Test
 * @Description
 * @Author laiyiming
 * @Date 2021/2/5 15:52
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }

}
