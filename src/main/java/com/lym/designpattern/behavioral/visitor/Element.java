package com.lym.designpattern.behavioral.visitor;

/**
 * @ClassName Element
 * @Description 抽象元素类
 * @Author laiyiming
 * @Date 2021/3/16 9:53
 */
public interface Element {
    void accept(Visitor visitor);
}
