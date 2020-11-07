package main.baseball.domain;

import main.baseball.domain.result.*;

import java.util.Objects;

public class BaseballResultFactory {
    public static BaseballResult getBaseballResultObject(int strikeCount, int ballCount) {
        Strike strike = null;
        Ball ball = null;

        if (strikeCount > 0) strike = new Strike(strikeCount);
        if (ballCount > 0) ball = new Ball(ballCount);

        if (Objects.nonNull(strike) && Objects.nonNull(ball)) return new StrikeWithBall(strike, ball);
        if (Objects.nonNull(strike)) return strike;
        if (Objects.nonNull(ball)) return ball;

        return new Nothing();
    }
}
