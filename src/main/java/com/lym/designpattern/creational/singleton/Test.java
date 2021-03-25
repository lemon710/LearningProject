package com.lym.designpattern.creational.singleton;

/**
 * @ClassName Tets
 * @Description
 * @Author laiyiming
 * @Date 2021/1/25 16:28
 */
public class Test {
    public static void main(String[] args) {

        hungrySingletonTest();
        lazySingletonTest();
    }

    private static void hungrySingletonTest() {
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        if (hungrySingleton1 == hungrySingleton2) {
            System.out.println("饿汉式单例模式生成的两个对象是同一个对象");
        } else {
            System.out.println("饿汉式单例模式生成的两个对象不是同一个对象");
        }
    }

    private static void lazySingletonTest() {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        if (lazySingleton1 == lazySingleton2) {
            System.out.println("懒汉式单例模式生成的两个对象是同一个对象");
        } else {
            System.out.println("懒汉式单例模式生成的两个对象不是同一个对象");
        }
    }

}
