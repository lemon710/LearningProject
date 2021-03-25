package com.lym.designpattern.behavioral.memento;

/**
 * @ClassName Originator
 * @Description 发起人
 * @Author laiyiming
 * @Date 2021/3/16 10:50
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
