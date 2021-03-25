package com.lym.designpattern.behavioral.chainofresponsibility;

/**
 * @ClassName DepartmentHead
 * @Description 具体处理者2：系主任类
 * @Author laiyiming
 * @Date 2021/3/12 16:06
 */
public class DepartmentHead extends Leader{

    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 7) {
            System.out.println("系主任批准您请假" + leaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(leaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
