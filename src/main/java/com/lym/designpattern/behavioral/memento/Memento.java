package com.lym.designpattern.behavioral.memento;

/**
 * @ClassName Memento
 * @Description 备忘录
 * @Author laiyiming
 * @Date 2021/3/16 10:49
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
