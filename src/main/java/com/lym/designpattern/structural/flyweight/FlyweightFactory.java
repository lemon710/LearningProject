package com.lym.designpattern.structural.flyweight;

import java.util.HashMap;

/**
 * @ClassName FlyweightFactory
 * @Description 享元工厂角色
 * @Author laiyiming
 * @Date 2021/3/5 15:31
 */
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = (Flyweight) flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
