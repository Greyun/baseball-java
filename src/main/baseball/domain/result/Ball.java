package main.baseball.domain.result;

public class Ball implements BaseballResult {
    private final int count;

    public Ball(int count) {
        this.count = count;
    }

    @Override
    public String getResultString() {
        return count + " Ball";
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
