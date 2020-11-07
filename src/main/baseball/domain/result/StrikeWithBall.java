package main.baseball.domain.result;

public class StrikeWithBall implements BaseballResult {
    private final Strike strike;
    private final Ball ball;

    public StrikeWithBall(Strike strike, Ball ball) {
        this.strike = strike;
        this.ball = ball;
    }

    @Override
    public String getResultString() {
        return strike.getResultString() + ", " + ball.getResultString();
    }

    @Override
    public boolean isFinished() {
        return strike.isFinished();
    }
}
