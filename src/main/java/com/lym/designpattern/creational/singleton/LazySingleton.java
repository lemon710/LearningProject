package com.lym.designpattern.creational.singleton;

/**
 * @ClassName LazySingleton
 * @Description 懒汉式单例
 * @Author laiyiming
 * @Date 2021/1/25 16:20
 */
public class LazySingleton {
    // 保证instance在所有线程中同步
    private static volatile LazySingleton instance = null;

    //私有化构造方法
    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        // getInstance方法前加同步
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
