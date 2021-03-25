package com.lym.designpattern.behavioral.state;

/**
 * @ClassName ScoreContext
 * @Description 环境类
 * @Author laiyiming
 * @Date 2021/3/12 16:59
 */
public class ScoreContext {
    private AbstractState state;
    ScoreContext() {
        state = new LowState(this);
    }
    public void setState(AbstractState state) {
        this.state = state;
    }
    public AbstractState getState() {
        return state;
    }
    public void add(int score) {
        state.addScore(score);
    }
}
