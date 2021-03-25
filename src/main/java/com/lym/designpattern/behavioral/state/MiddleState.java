package com.lym.designpattern.behavioral.state;

/**
 * @ClassName MiddleState
 * @Description 具体状态类：中等
 * @Author laiyiming
 * @Date 2021/3/12 16:59
 */
public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        hj = state.hj;
        stateName = "中等";
        score = state.score;
    }
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score >= 90) {
            hj.setState(new HighState(this));
        }
    }
}
