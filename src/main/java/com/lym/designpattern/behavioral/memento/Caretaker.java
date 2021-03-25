package com.lym.designpattern.behavioral.memento;

/**
 * @ClassName Caretaker
 * @Description 管理者
 * @Author laiyiming
 * @Date 2021/3/16 10:50
 */
public class Caretaker {
    private Memento memento;

    public void setMemento(Memento m) {
        memento = m;
    }

    public Memento getMemento() {
        return memento;
    }
}
