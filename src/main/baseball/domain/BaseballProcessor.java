package main.baseball.domain;

import main.baseball.domain.result.BaseballResult;

public class BaseballProcessor {

    public BaseballResult getProcessResult(int[] a, int[] b) {
        return BaseballResultFactory.getBaseballResultObject(getStrikeCount(a, b), getBallCount(a, b));
    }

    private int getBallCount(int[] a, int[] b) {
        int ballCount = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++) {
                if (i == j) continue;
                if (a[i] == b[j]) ballCount++;
            }
        return ballCount;
    }

    private int getStrikeCount(int[] a, int[] b) {
        int strikeCount = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == b[i]) strikeCount++;
        return strikeCount;
    }
}
