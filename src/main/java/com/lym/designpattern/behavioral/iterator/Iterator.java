package com.lym.designpattern.behavioral.iterator;

/**
 * @ClassName Iterator
 * @Description 具体迭代器
 * @Author laiyiming
 * @Date 2021/3/15 17:03
 */
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}
