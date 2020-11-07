package main.baseball.domain;

import main.baseball.domain.result.*;

import java.util.Objects;

public class BaseballProcessor {

    public BaseballResult getProcessResult(int[] a, int[] b) {
        Strike strike = null;
        Ball ball = null;

        int strikeCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) strikeCount++;
        }
        if (strikeCount > 0) strike = new Strike(strikeCount);

        int ballCount = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (i == j) continue;
                if (a[i] == b[j]) ballCount++;
            }
        }
        if (ballCount > 0) ball = new Ball(ballCount);

        if (Objects.nonNull(strike) && Objects.nonNull(ball)) return new StrikeWithBall(strike, ball);
        if (Objects.nonNull(strike)) return strike;
        if (Objects.nonNull(ball)) return ball;

        return new Nothing();
    }
}
