package main.baseball.domain.result;

public class Nothing implements BaseballResult {

    @Override
    public String getResultString() {
        return "Nothing";
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
