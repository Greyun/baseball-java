package main.baseball;

import main.baseball.domain.BaseballProcessor;
import main.baseball.domain.result.BaseballResult;
import main.baseball.util.NumberGenerator;
import main.baseball.util.SystemInputGetter;

import java.util.Arrays;

import static main.baseball.type.BaseballConfig.LENGTH_OF_NUMBER;

public class BaseballManager {
    private final SystemInputGetter inputGetter = new SystemInputGetter();
    private int[] computerNumbers;
    private int[] userNumbers;
    private BaseballResult result;

    public void execute() {
        do {
            startBaseball();
        } while (isContinue());
        System.out.println("게임 종료");
    }

    private boolean isContinue() {
        return "Y".equalsIgnoreCase(inputGetter.getExitOptionFromSystemInput());
    }

    private void startBaseball() {
        setComputerNumbers();
        System.out.println(Arrays.toString(computerNumbers));

        matchTheComputerNumbers();
    }

    private void setComputerNumbers() {
        computerNumbers = generateNumbers();
    }

    private void matchTheComputerNumbers() {
        do {
            setUserNumbers();
        } while (!isNumberAllStrike());
        System.out.println("승리!");
    }

    private boolean isNumberAllStrike() {
        setBaseballResult();
        System.out.println(result.getResultString());
        return result.isFinished();
    }

    private void setUserNumbers() {
        userNumbers = receiveUserNumbers();
    }

    private int[] receiveUserNumbers() {
        SystemInputGetter inputGetter = new SystemInputGetter();
        return SystemInputGetter.getNumbersFromSystemInput(inputGetter);
    }

    private int[] generateNumbers() {
        NumberGenerator generator = new NumberGenerator();
        return generator.generateNumbers(LENGTH_OF_NUMBER);
    }

    private void setBaseballResult() {
        BaseballProcessor processor = new BaseballProcessor();
        result = processor.getProcessResult(computerNumbers, userNumbers);
    }
}
