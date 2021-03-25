package com.lym.designpattern.structural.composite;

import java.util.ArrayList;

/**
 * @ClassName Composite
 * @Description 树枝构件
 * @Author laiyiming
 * @Date 2021/3/5 17:31
 */
public class Composite implements Component {

    private ArrayList<Component> children = new ArrayList<>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Object obj:children) {
            ((Component) obj).operation();
        }
    }
}
