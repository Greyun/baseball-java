package main.baseball.domain.result;

import static main.baseball.type.BaseballConfig.LENGTH_OF_NUMBER;

public class Strike implements BaseballResult {
    private final int count;

    public Strike(int count) {
        this.count = count;
    }

    @Override
    public String getResultString() {
        return count + " Strike";
    }

    @Override
    public boolean isFinished() {
        return count == LENGTH_OF_NUMBER;
    }
}
