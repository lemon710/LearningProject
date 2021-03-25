package com.lym.designpattern.behavioral.interpreter;

/**
 * @ClassName Expression
 * @Description 抽象表达式类
 * @Author laiyiming
 * @Date 2021/3/16 10:58
 */
public interface Expression {
    public boolean interpret(String info);
}
