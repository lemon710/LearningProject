package com.lym.designpattern.structural.flyweight;

/**
 * @ClassName ConcreteFlyweight
 * @Description 具体享元角色
 * @Author laiyiming
 * @Date 2021/3/5 15:15
 */
public class ConcreteFlyweight implements Flyweight{
    private String key;

    ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    public void operation(UnSharedConcreteFlyweight outState) {
        System.out.println("具体享元" + key + "被调用，");
        System.out.println("非享元信息是:" + outState.getInfo());
    }
}
