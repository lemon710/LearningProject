package com.lym.designpattern.behavioral.state;

/**
 * @ClassName AbstractState
 * @Description 抽象状态类
 * @Author laiyiming
 * @Date 2021/3/12 16:47
 */
abstract class AbstractState {
    protected ScoreContext hj;  //环境
    protected String stateName; //状态名
    protected int score; //分数
    public abstract void checkState(); //检查当前状态
    public void addScore(int x) {
        score += x;
        System.out.print("加上：" + x + "分，\t当前分数：" + score);
        checkState();
        System.out.println("分，\t当前状态：" + hj.getState().stateName);
    }
}
