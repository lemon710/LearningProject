package com.lym.designpattern.creational.prototype;

/**
 * @ClassName Shape
 * @Description
 * @Author laiyiming
 * @Date 2021/1/26 11:15
 */
public interface Shape extends Cloneable {
    /**
     * 拷贝
     * @return
     */
    public Object clone();

    /**
     * 计算面积
     */
    public void countArea();
}
