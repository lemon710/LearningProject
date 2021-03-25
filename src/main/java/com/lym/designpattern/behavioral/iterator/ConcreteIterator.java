package com.lym.designpattern.behavioral.iterator;

import java.util.List;

/**
 * @ClassName ConcreteIterator
 * @Description 具体迭代器
 * @Author laiyiming
 * @Date 2021/3/15 17:04
 */
public class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private int index = -1;
    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
    public Object first() {
        index = 0;
        Object obj = list.get(index);
        ;
        return obj;
    }
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }
}
