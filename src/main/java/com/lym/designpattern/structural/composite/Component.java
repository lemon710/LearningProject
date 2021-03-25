package com.lym.designpattern.structural.composite;

/**
 * @ClassName Component
 * @Description 抽象构件
 * @Author laiyiming
 * @Date 2021/3/5 17:28
 */
public interface Component {
    public void add(Component c);

    public void remove(Component c);

    public Component getChild(int i);

    public void operation();
}
