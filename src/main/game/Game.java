package main.game;

import main.game.util.NumberGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

    private final int LENGTH_OF_NUMBER = 3;

    public Game() {
    }

    public void start() {
        int[] computerNumbers = generateNumbers();
        System.out.println(Arrays.toString(computerNumbers));

        System.out.println("연속된 3개의 숫자를 입력하세요. ex) 123");
        int[] userNumbers = receiveNumbersFromUser();
        System.out.println(Arrays.toString(userNumbers));
    }

    private int[] receiveNumbersFromUser() {
        return getIntArrayFromString(getUserInput());
    }

    private int[] getIntArrayFromString(String userInput) {
        String[] userInputArray = userInput.split("");
        int[] userNumbers = new int[LENGTH_OF_NUMBER];
        for (int i = 0; i < userInputArray.length; i++) {
            userNumbers[i] = Integer.parseInt(userInputArray[i]);
        }
        return userNumbers;
    }

    private String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int[] generateNumbers() {
        NumberGenerator generator = new NumberGenerator();
        return generator.generateNumbers(LENGTH_OF_NUMBER);
    }
}
