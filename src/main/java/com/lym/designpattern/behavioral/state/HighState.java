package com.lym.designpattern.behavioral.state;

/**
 * @ClassName HighState
 * @Description //具体状态类：优秀
 * @Author laiyiming
 * @Date 2021/3/12 17:00
 */
public class HighState extends AbstractState {
    public HighState(AbstractState state) {
        hj = state.hj;
        stateName = "优秀";
        score = state.score;
    }
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score < 90) {
            hj.setState(new MiddleState(this));
        }
    }
}
