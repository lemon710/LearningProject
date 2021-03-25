package com.lym.designpattern.behavioral.state;

/**
 * @ClassName Test
 * @Description
 * @Author laiyiming
 * @Date 2021/3/12 17:01
 */
public class Test {
    public static void main(String[] args) {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}
