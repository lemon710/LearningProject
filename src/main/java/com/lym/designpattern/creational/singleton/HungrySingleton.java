package com.lym.designpattern.creational.singleton;

/**
 * @ClassName HungrySingleton
 * @Description 饿汉式单例
 * @Author laiyiming
 * @Date 2021/1/25 16:25
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    // 私有化构造方法
    private HungrySingleton() {}

    // 对外提供获取实例的方法
    public static HungrySingleton getInstance() {
        return instance;
    }

}
