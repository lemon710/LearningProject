package com.lym.designpattern.behavioral.iterator;

/**
 * @ClassName Aggregate
 * @Description 抽象聚合
 * @Author laiyiming
 * @Date 2021/3/15 17:06
 */
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}
