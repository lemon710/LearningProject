package com.lym.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteAggregate
 * @Description 具体聚合
 * @Author laiyiming
 * @Date 2021/3/15 17:06
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<Object>();
    public void add(Object obj) {
        list.add(obj);
    }
    public void remove(Object obj) {
        list.remove(obj);
    }
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
