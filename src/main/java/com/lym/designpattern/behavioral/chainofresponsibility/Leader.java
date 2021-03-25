package com.lym.designpattern.behavioral.chainofresponsibility;

/**
 * @ClassName Leader
 * @Description 抽象处理者：领导类
 * @Author laiyiming
 * @Date 2021/3/12 15:59
 */
abstract class Leader {
    private Leader next;

    public void setNext(Leader next) {
        this.next = next;
    }

    public Leader getNext() {
        return next;
    }

    //处理请求的方法
    public abstract void handleRequest(int leaveDays);
}
